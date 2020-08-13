package com.eric.gamespace.taoism.service.impl;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.eric.gamespace.taoism.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService {

	@Resource
	private RedisTemplate redisTemplate;

	@Override
	public void setObj(final String key, Object obj, long timeout) {
		ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        operations.set(key, obj, timeout, TimeUnit.SECONDS);
	}

	@Override
	public Object getObj(final String key) {
		Object o = redisTemplate.opsForValue().get(key);
        return o;
	}
	
	@Override
	public void setObj(final String key, Object obj) {
		ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        operations.set(key, obj);
	}
	
}
