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
		String SUCCESS = "000";
		
		/**
		 * 业务失败
		 */
		String FAILURE = "111";
		
		/**
		 * 系统异常
		 */
		String SYS_ERR = "999";
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
		 * 系统异常
		 */
		String SYS_ERR = "系统异常";
		
		/**
		 * 注册报错，该账号已存在
		 */
		String LOGIN_ACCT_EXIST = "账号已存在";
		
		/**
		 * 密码错误
		 */
		String PWD_ERR = "密码错误";
	}
	
	/**
	 * 数据库参数表参数类型
	 * @author eric
	 *
	 */
	interface ParamType {
		
		/**
		 * 系统参数
		 */
		String SYS_PARAM = "0000";
	}
	
	/**
	 * 缓存参数的Key
	 * @author eric
	 *
	 */
	interface CacheKey {
		
		/**
		 * 测试redis用key
		 */
		String TEST_KEY = "testKey";
		
		/**
		 * MD5加密key
		 */
		String MD5_KEY = "MD5-KEY";
	}
	
	/**
	 * 账户类型
	 * @author eric
	 *
	 */
	interface AcctType {
		
		/**
		 * 普通用户
		 */
		String NORMAL = "0";
		
		/**
		 * 管理员
		 */
		String ADMIN = "1";
		
		/**
		 * 测试用户
		 */
		String TEST = "2";
	}
	
	/**
	 * 账户状态
	 * @author catji
	 *
	 */
	interface AcctStatus {
		
		/**
		 * 初始状态
		 */
		String INIT = "00";
		
		/**
		 * 正常
		 */
		String NORMAL = "01";
		
		/**
		 * 冻结
		 */
		String FREEZE = "02";
		
		/**
		 * 封禁
		 */
		String PROHIBIT = "03";
		
	}
}
