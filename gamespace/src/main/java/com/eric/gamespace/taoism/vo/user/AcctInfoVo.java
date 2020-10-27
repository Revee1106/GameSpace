package com.eric.gamespace.taoism.vo.user;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 账户信息vo
 * @author eric
 *
 */
@Getter
@Setter
public class AcctInfoVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9058426603815759293L;

	private String loginAcct;

    private String loginPwd;

    private String acctNickName;

    private String acctStatus;
    
    private String acctStatusDesc;

    private String acctType;

    private String acctLevel;

    private String acctEmailAddr;

    private String acctPhoneNo;
	
}
