package com.eric.gamespace.taoism.service;

/**
 * redis接口
 * @author eric
 *
 */
public interface RedisService {

	/**
	 * 带过期时间存放redis
	 * @param key
	 * @param obj
	 * @param timeout
	 */
	void setObj(String key, Object obj, long timeout);

	/**
	 * 根据key获取value
	 * @param key
	 * @return
	 */
    Object getObj(String key);
	
    /**
     * 不带过期时间存放redis
     * @param key
     * @param obj
     */
    void setObj(String key, Object obj);
}
