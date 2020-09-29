package com.eric.gamespace.taoism.vo.user;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户注册请求类
 * @author eric
 *
 */
@Getter
@Setter
public class UserRegistReqVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7684453634083229947L;

	private AcctInfoVo acctInfo;
}
