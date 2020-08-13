package com.eric.gamespace.taoism.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.eric.gamespace.taoism.common.Constant;
import com.eric.gamespace.taoism.dao.TaoismParamInfoMapper;
import com.eric.gamespace.taoism.entity.TaoismParamInfo;
import com.eric.gamespace.taoism.service.RedisService;

/**
 * 缓存的常量
 * @author eric
 *
 */
@Component
public class CacheConstant {
	
	public static Map<String, Object> constantMap = new HashMap<String, Object>();
	
	@Autowired
	private TaoismParamInfoMapper paramInfoMapper;
	
	@Autowired
	private RedisService redisService;
	
	@PostConstruct
	public void init() {
		//系统启动后加载数据
		List<TaoismParamInfo> paramInfos = paramInfoMapper.selectByParamType(Constant.ParamType.SYS_PARAM);
		//循环处理查询出来的系统参数，并放入redis缓存中，避免后面使用时查询数据库
		for (TaoismParamInfo paramInfo : paramInfos) {
			//放入缓存中，缓存2小时
			redisService.setObj(paramInfo.getParamKey(), paramInfo.getParamValue());
			//放入常量map中
			constantMap.put(paramInfo.getParamKey(), paramInfo.getParamValue());
		}
	}
	
	/**
	 * 每两小时刷新一次缓存和全局变量
	 */
	@Scheduled(cron = "0 0 0/2 * * ?")
	public void reinit() {
		init();
	}

}
