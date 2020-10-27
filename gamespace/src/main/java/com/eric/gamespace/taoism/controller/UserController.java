package com.eric.gamespace.taoism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eric.gamespace.taoism.cache.CacheConstant;
import com.eric.gamespace.taoism.common.Constant;
import com.eric.gamespace.taoism.common.util.JsonUtil;
import com.eric.gamespace.taoism.service.UserService;
import com.eric.gamespace.taoism.vo.user.AcctInfoVo;
import com.eric.gamespace.taoism.vo.user.UserChangePwdReqVo;
import com.eric.gamespace.taoism.vo.user.UserChangePwdRespVo;
import com.eric.gamespace.taoism.vo.user.UserRegistReqVo;
import com.eric.gamespace.taoism.vo.user.UserRegistRespVo;

import lombok.extern.slf4j.Slf4j;

/**
 * 账号相关
 * 包含注册、登陆、修改密码等
 * @author eric
 *
 */

@RestController
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user/regist", method = RequestMethod.POST)
	public UserRegistRespVo regist(@RequestBody UserRegistReqVo reqVo) {
		log.info("regist start, param is:{}", JsonUtil.beanToJson(reqVo));
		UserRegistRespVo respVo = userService.regist(reqVo);
		log.info("regist end, response is:{}", JsonUtil.beanToJson(respVo));
		return respVo;
	}
	
	@RequestMapping(value = "/user/changePwd", method = RequestMethod.POST)
	public UserChangePwdRespVo changePwd(@RequestBody UserChangePwdReqVo reqVo) {
		log.info("changePwd start, param is:{}", JsonUtil.beanToJson(reqVo));
		UserChangePwdRespVo respVo = userService.changePwd(reqVo);
		log.info("changePwd end, response is:{}", JsonUtil.beanToJson(respVo));
		return respVo;
	}
	
	public static void main(String[] args) {
		UserRegistReqVo reqVo = new UserRegistReqVo();
		AcctInfoVo vo = new AcctInfoVo();
		vo.setLoginAcct("cxm1106");
		vo.setLoginPwd("ykk4y9n24d");
		vo.setAcctNickName("cxm1106");
		vo.setAcctEmailAddr("catjie1106@hotmail.com");
		vo.setAcctPhoneNo("13818402097");
		reqVo.setAcctInfo(vo);
		System.out.println(JsonUtil.beanToJson(reqVo));
	}
	
	@RequestMapping(value = "/")
	public String home() {
		return "Welcome to My GameSpace!" + CacheConstant.constantMap.get(Constant.CacheKey.TEST_KEY);
	}
	
}
