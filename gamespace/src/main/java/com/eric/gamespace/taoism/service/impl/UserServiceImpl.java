package com.eric.gamespace.taoism.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.gamespace.taoism.common.Constant;
import com.eric.gamespace.taoism.dao.TaoismAcctInfoMapper;
import com.eric.gamespace.taoism.entity.TaoismAcctInfo;
import com.eric.gamespace.taoism.service.UserService;
import com.eric.gamespace.taoism.vo.user.UserRegistReqVo;
import com.eric.gamespace.taoism.vo.user.UserRegistRespVo;

import lombok.extern.slf4j.Slf4j;


/**
 * 用户域服务实现类
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
		//入参所有判空在页面完成，这里不做判断
		UserRegistRespVo respVo = new UserRegistRespVo();
		//注册前先查询账号是否重复
		TaoismAcctInfo queryResult = taoismAcctInfoMapper.selectByPrimaryKey(reqVo.getLoginAcct());
		if(queryResult != null) {//账号已存在
			respVo.setRespCode(Constant.RespCode.SUCCESS);
			respVo.setRespMsg(Constant.RespMsg.SUCCESS);
			respVo.setBizCode(Constant.BizCode.FAILURE);
			respVo.setBizMsg(Constant.BizMsg.LOGIN_ACCT_EXIST);
		}else {
			//注册入库
			TaoismAcctInfo createAcct = new TaoismAcctInfo();
			createAcct.setLoginAcct(reqVo.getLoginAcct());
		}
		return null;
	}

}
