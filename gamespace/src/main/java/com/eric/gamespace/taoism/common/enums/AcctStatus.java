package com.eric.gamespace.taoism.common.enums;

import lombok.Getter;

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
	
	public static String getStatusDesc(String acctStatusStr) {  
		AcctStatus[] acctStatuses = values();  
        for (AcctStatus acctStatus : acctStatuses) {  
            if (acctStatus.acctStatus().equals(acctStatusStr)) {  
                return acctStatus.statusDesc;  
            }  
        }  
        return null;  
    }   
      
    public static String getAcctStatus(String statusDescStr) {  
    	AcctStatus[] acctStatuses = values();  
        for (AcctStatus acctStatus : acctStatuses) {  
            if (acctStatus.statusDesc().equals(statusDescStr)) {  
                return acctStatus.acctStatus();  
            }  
        }  
        return null;  
    }
    
    public String acctStatus(){  
        return this.acctStatus;  
    }  
      
    public String statusDesc(){  
        return this.statusDesc;  
    } 
}
