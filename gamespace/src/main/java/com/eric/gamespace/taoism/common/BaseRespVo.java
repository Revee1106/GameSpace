package com.eric.gamespace.taoism.common;

import lombok.Getter;
import lombok.Setter;

/**
 * 基本响应类
 * @author eric
 *
 */
@Getter
@Setter
public class BaseRespVo {

	/**
	 * 网络请求应答码
	 */
	private String respCode;
	
	/**
	 * 网络请求应答描述
	 */
	private String respMsg;
	
	/**
	 * 业务应答码
	 */
	private String bizCode;
	
	/**
	 * 业务应答描述
	 */
	private String bizMsg;
}
