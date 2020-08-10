package com.eric.gamespace.taoism.service;

/**
 * redis接口
 * @author eric
 *
 */
public interface RedisService {

	void setObj(String key, Object obj, long timeout);

    Object getObj(String key);
	
}
