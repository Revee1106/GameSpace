package com.eric.gamespace.taoism.entity;

public class TaoismAcctInfo {
    private String loginAcct;

    private String loginPwd;

    private String acctNickName;

    private String acctStatus;

    private String acctStatusDesc;

    private String acctType;

    private String acctLevel;

    private String acctEmailAddr;

    private String acctPhoneNo;

    public String getLoginAcct() {
        return loginAcct;
    }

    public void setLoginAcct(String loginAcct) {
        this.loginAcct = loginAcct == null ? null : loginAcct.trim();
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    public String getAcctNickName() {
        return acctNickName;
    }

    public void setAcctNickName(String acctNickName) {
        this.acctNickName = acctNickName == null ? null : acctNickName.trim();
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus == null ? null : acctStatus.trim();
    }

    public String getAcctStatusDesc() {
        return acctStatusDesc;
    }

    public void setAcctStatusDesc(String acctStatusDesc) {
        this.acctStatusDesc = acctStatusDesc == null ? null : acctStatusDesc.trim();
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    public String getAcctLevel() {
        return acctLevel;
    }

    public void setAcctLevel(String acctLevel) {
        this.acctLevel = acctLevel == null ? null : acctLevel.trim();
    }

    public String getAcctEmailAddr() {
        return acctEmailAddr;
    }

    public void setAcctEmailAddr(String acctEmailAddr) {
        this.acctEmailAddr = acctEmailAddr == null ? null : acctEmailAddr.trim();
    }

    public String getAcctPhoneNo() {
        return acctPhoneNo;
    }

    public void setAcctPhoneNo(String acctPhoneNo) {
        this.acctPhoneNo = acctPhoneNo == null ? null : acctPhoneNo.trim();
    }
}