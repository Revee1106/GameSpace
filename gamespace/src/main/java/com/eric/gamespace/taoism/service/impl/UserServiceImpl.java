package com.eric.gamespace.taoism.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eric.gamespace.taoism.cache.CacheConstant;
import com.eric.gamespace.taoism.common.Constant;
import com.eric.gamespace.taoism.common.enums.AcctStatus;
import com.eric.gamespace.taoism.common.util.JsonUtil;
import com.eric.gamespace.taoism.common.util.MD5Util;
import com.eric.gamespace.taoism.dao.TaoismAcctInfoMapper;
import com.eric.gamespace.taoism.entity.TaoismAcctInfo;
import com.eric.gamespace.taoism.service.UserService;
import com.eric.gamespace.taoism.vo.user.AcctInfoVo;
import com.eric.gamespace.taoism.vo.user.UserChangePwdReqVo;
import com.eric.gamespace.taoism.vo.user.UserChangePwdRespVo;
import com.eric.gamespace.taoism.vo.user.UserRegistReqVo;
import com.eric.gamespace.taoism.vo.user.UserRegistRespVo;
import com.eric.gamespace.taoism.vo.user.dto.AcctInfoDTO;

import lombok.extern.slf4j.Slf4j;

/**
 * 用户域服务实现类
 * 
 * @author eric
 *
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private TaoismAcctInfoMapper taoismAcctInfoMapper;

	@Override
	@Transactional
	public UserRegistRespVo regist(UserRegistReqVo reqVo) {
		// 入参所有判空在页面完成，这里不做判断
		UserRegistRespVo respVo = new UserRegistRespVo();
		// 注册前先查询账号是否重复
		TaoismAcctInfo queryResult = taoismAcctInfoMapper.selectByLoginAcct(reqVo.getAcctInfo().getLoginAcct());
		if (queryResult != null) {// 账号已存在
			respVo.setBizCode(Constant.BizCode.FAILURE);
			respVo.setBizMsg(Constant.BizMsg.LOGIN_ACCT_EXIST);
		} else {
			// 注册入库
			TaoismAcctInfo createAcct = new TaoismAcctInfo();
			createAcct.setAcctType(Constant.AcctType.NORMAL);
			createAcct.setAcctLevel("0");
			createAcct.setLoginAcct(reqVo.getAcctInfo().getLoginAcct());
			// 密码MD5加密入库
			createAcct.setLoginPwd(MD5Util.md5Encrypt(reqVo.getAcctInfo().getLoginPwd(),
					(String) CacheConstant.constantMap.get(Constant.CacheKey.MD5_KEY), "UTF-8"));
			createAcct.setAcctNickName(reqVo.getAcctInfo().getAcctNickName());
			createAcct.setAcctEmailAddr(reqVo.getAcctInfo().getAcctEmailAddr());
			createAcct.setAcctPhoneNo(reqVo.getAcctInfo().getAcctPhoneNo());
			//TODO 后续修改成这里状态为初始，邮箱链接点击后改成正常状态
			createAcct.setAcctStatus(Constant.AcctStatus.NORMAL);
			createAcct.setAcctStatusDesc(AcctStatus.getStatusDesc(createAcct.getAcctStatus()));
			log.info("{},创建账号参数:{}",reqVo.getAcctInfo().getLoginAcct(),JsonUtil.beanToJson(createAcct));
			taoismAcctInfoMapper.insert(createAcct);
			//将po转成vo返回
			AcctInfoVo acctInfo = AcctInfoDTO.AcctInfoP2V(createAcct);
			respVo.setBizCode(Constant.BizCode.SUCCESS);
			respVo.setBizMsg(Constant.BizMsg.SUCCESS);
			respVo.setAcctInfo(acctInfo);
		}
		respVo.setRespCode(Constant.RespCode.SUCCESS);
		respVo.setRespMsg(Constant.RespMsg.SUCCESS);
		return respVo;
	}

	@Override
	@Transactional
	public UserChangePwdRespVo changePwd(UserChangePwdReqVo reqVo) {
		// 入参所有判空在页面完成，这里不做判断
		UserChangePwdRespVo respVo = new UserChangePwdRespVo();
		try {
			// 账号也不判空，页面上做限制
			TaoismAcctInfo queryResult = taoismAcctInfoMapper.selectByLoginAcct(reqVo.getLoginAcct());
			// 讲传入的旧密码md5加密后进行比对
			String oldPwd = MD5Util.md5Encrypt(reqVo.getOldLoginPwd(),
					(String) CacheConstant.constantMap.get(Constant.CacheKey.MD5_KEY), "UTF-8");
			if(oldPwd.equals(queryResult.getLoginPwd())) {
				// 相同则进行修改密码
				String newPwd = MD5Util.md5Encrypt(reqVo.getNewLoginPwd(),
						(String) CacheConstant.constantMap.get(Constant.CacheKey.MD5_KEY), "UTF-8");
				queryResult.setLoginPwd(newPwd);
				taoismAcctInfoMapper.updatePwdByAcctId(queryResult);
				respVo.setBizCode(Constant.BizCode.SUCCESS);
				respVo.setBizMsg(Constant.BizMsg.SUCCESS);
			}else {
				// 不相同则返回密码错误
				respVo.setBizCode(Constant.BizCode.FAILURE);
				respVo.setBizMsg(Constant.BizMsg.PWD_ERR);
			}
			respVo.setRespCode(Constant.RespCode.SUCCESS);
			respVo.setRespMsg(Constant.RespMsg.SUCCESS);
		} catch (Exception e) {
			log.error("修改密码异常:", e);
			respVo.setRespCode(Constant.RespCode.SUCCESS);
			respVo.setRespMsg(Constant.RespMsg.SUCCESS);
			respVo.setBizCode(Constant.BizCode.SYS_ERR);
			respVo.setBizMsg(Constant.BizMsg.SYS_ERR);
		}
		return respVo;
	}

}
