package com.eric.gamespace.taoism.service;

import com.eric.gamespace.taoism.vo.user.UserRegistReqVo;
import com.eric.gamespace.taoism.vo.user.UserRegistRespVo;

public interface UserService {

	/**
	 * 用户注册
	 * @param reqVo
	 * @return
	 */
	UserRegistRespVo userRegist(UserRegistReqVo reqVo);

}
