package com.eric.gamespace.taoism.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.gamespace.taoism.cache.CacheConstant;
import com.eric.gamespace.taoism.common.Constant;
import com.eric.gamespace.taoism.common.util.JsonUtil;
import com.eric.gamespace.taoism.common.util.MD5Util;
import com.eric.gamespace.taoism.dao.TaoismAcctInfoMapper;
import com.eric.gamespace.taoism.entity.TaoismAcctInfo;
import com.eric.gamespace.taoism.service.UserService;
import com.eric.gamespace.taoism.vo.user.AcctInfoVo;
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
	public UserRegistRespVo userRegist(UserRegistReqVo reqVo) {
		// 入参所有判空在页面完成，这里不做判断
		UserRegistRespVo respVo = new UserRegistRespVo();
		// 注册前先查询账号是否重复
		TaoismAcctInfo queryResult = taoismAcctInfoMapper.selectByPrimaryKey(reqVo.getAcctInfo().getLoginAcct());
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
			createAcct.setAcctNickName(reqVo.getAcctInfo().getNickName());
			createAcct.setAcctEmailAddr(reqVo.getAcctInfo().getEmailAddr());
			//TODO 后续修改成这里状态为初始，邮箱链接点击后改成正常状态
			createAcct.setAcctStatus(Constant.AcctStatus.NORMAL);
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

}
