package com.eric.gamespace.taoism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.eric.gamespace.taoism.service.CharacterService;

import lombok.extern.slf4j.Slf4j;

/**
 * 人物控制
 * 包含创建人物、删除人物等
 * @author eric
 *
 */

@RestController
@Slf4j
public class CharacterController {

	@Autowired
	private CharacterService characterService;
	
}
