package com.eric.gamespace.taoism.common.enums;

import lombok.Getter;

/**
 * 账户类型枚举
 * @author eric
 *
 */
@Getter
public enum AcctType {

	NORMAL("0", "普通用户"),
	ADMIN("1", "管理员"),
	TEST("2", "测试账号");
	
	private String acctType;
	private String typeDesc;
	
	private AcctType (String acctType, String typeDesc) {
		this.acctType = acctType;
		this.typeDesc = typeDesc;
	}
}
