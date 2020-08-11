package com.eric.gamespace.taoism.common;

/**
 * 系统常量类
 * @author eric
 *
 */
public interface Constant {

	/**
	 * 网络响应应答码
	 * @author eric
	 *
	 */
	interface RespCode {
		
		/**
		 * 成功应答
		 */
		String SUCCESS = "success";
		
	}
	
	/**
	 * 网络应答应答描述
	 * @author eric
	 *
	 */
	interface RespMsg {
		
		/**
		 * 成功应答
		 */
		String SUCCESS = "成功";
		
	}
	
	/**
	 * 业务应答码
	 * @author eric
	 *
	 */
	interface BizCode {
		
		/**
		 * 业务成功
		 */
		String SUCCESS = "000000";
		
		/**
		 * 业务失败
		 */
		String FAILURE = "111111";
	}
	
	/**
	 * 业务应答描述
	 * @author eric
	 *
	 */
	interface BizMsg {
		
		/**
		 * 业务成功
		 */
		String SUCCESS = "成功";
		
		/**
		 * 注册报错，该账号已存在
		 */
		String LOGIN_ACCT_EXIST = "账号已存在";
	}
}
