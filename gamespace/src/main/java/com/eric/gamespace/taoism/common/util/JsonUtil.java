package com.eric.gamespace.taoism.common.util;

import com.alibaba.fastjson.JSON;

import lombok.extern.slf4j.Slf4j;

/**
 * json数据工具类
 * @author eric
 *
 */
@Slf4j
public class JsonUtil {

	public static String beanToJson(Object obj) {
		try {
			return JSON.toJSONString(obj);
		} catch (Exception e) {
			log.error("json转化失败:{}", e);
			return "";
		}
	}
	
}
