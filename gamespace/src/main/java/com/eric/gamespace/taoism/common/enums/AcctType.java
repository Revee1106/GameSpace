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
	
	public static String getTypeDesc(String acctTypeStr) {  
		AcctType[] acctTypies = values();  
        for (AcctType acctType : acctTypies) {  
            if (acctType.acctType().equals(acctTypeStr)) {  
                return acctType.typeDesc();  
            }  
        }  
        return null;  
    }   
      
    public static String getAcctType(String typeDescStr) {  
    	AcctType[] acctTypies = values();  
        for (AcctType acctType : acctTypies) {  
            if (acctType.typeDesc().equals(typeDescStr)) {  
                return acctType.acctType();  
            }  
        }  
        return null;  
    }
    
    public String acctType(){  
        return this.acctType;  
    }  
      
    public String typeDesc(){  
        return this.typeDesc;  
    } 
}
