package com.eric.gamespace.taoism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.eric.gamespace.taoism.common.util.JsonUtil;
import com.eric.gamespace.taoism.service.RedisService;
import com.eric.gamespace.taoism.service.UserService;
import com.eric.gamespace.taoism.vo.user.UserRegistReqVo;
import com.eric.gamespace.taoism.vo.user.UserRegistRespVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RedisService redisService;
	
	@RequestMapping(value = "/userRegist")
	public UserRegistRespVo userRegist(@RequestBody UserRegistReqVo reqVo) {
		log.info("userRegist start, param is:{}", JsonUtil.beanToJson(reqVo));
		UserRegistRespVo respVo = userService.userRegist(reqVo);
		return null;
		
	}
	
	@RequestMapping(value = "/testRedis")
	public String testRedis() {
		redisService.setObj("name", "taoism", 300);
		return (String) redisService.getObj("name");
	}

	@RequestMapping(value = "/")
	public String home() {
		return "Welcome to My GameSpace!";
	}
	
}
