package com.eric.gamespace.taoism.vo.user;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户修改密码请求类
 * @author eric
 *
 */
@Getter
@Setter
public class UserChangePwdReqVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 828869162377862121L;

	private String loginAcct;
	
	private String oldLoginPwd;
	
	private String newLoginPwd;
}
