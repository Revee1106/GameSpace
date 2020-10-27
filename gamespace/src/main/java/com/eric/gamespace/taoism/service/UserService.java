package com.eric.gamespace.taoism.service;

import com.eric.gamespace.taoism.vo.user.UserChangePwdReqVo;
import com.eric.gamespace.taoism.vo.user.UserChangePwdRespVo;
import com.eric.gamespace.taoism.vo.user.UserRegistReqVo;
import com.eric.gamespace.taoism.vo.user.UserRegistRespVo;

public interface UserService {

	/**
	 * 用户注册
	 * @param reqVo
	 * @return
	 */
	UserRegistRespVo regist(UserRegistReqVo reqVo);

	/**
	 * 用户修改密码
	 * @param reqVo
	 * @return
	 */
	UserChangePwdRespVo changePwd(UserChangePwdReqVo reqVo);

}
