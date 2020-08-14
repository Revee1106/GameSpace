package com.eric.gamespace.taoism.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * 账户状态枚举
 * @author eric
 *
 */
@Getter
public enum AcctStatus {
	

	INIT("00", "未激活"),
	NORMAL("01", "已激活"),
	FREEZE("02", "已冻结"),
	PROHIBIT("03", "已封禁");
	
	private final String acctStatus;
	private final String statusDesc;
	
	private AcctStatus(String acctStatus, String statusDesc) {
		this.acctStatus = acctStatus;
		this.statusDesc = statusDesc;
	}
}
