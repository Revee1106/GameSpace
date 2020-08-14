package com.eric.gamespace.taoism.vo.user;

import java.io.Serializable;

import com.eric.gamespace.taoism.common.BaseRespVo;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户注册响应类
 * @author eric
 *
 */
@Getter
@Setter
public class UserRegistRespVo extends BaseRespVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5477490901722913367L;

	private AcctInfoVo acctInfo;
}
