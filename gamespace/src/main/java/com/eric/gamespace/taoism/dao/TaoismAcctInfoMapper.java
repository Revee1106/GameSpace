package com.eric.gamespace.taoism.dao;

import com.eric.gamespace.taoism.entity.TaoismAcctInfo;

public interface TaoismAcctInfoMapper {
    int deleteByPrimaryKey(Integer acctId);

    int insert(TaoismAcctInfo record);

    int insertSelective(TaoismAcctInfo record);

    TaoismAcctInfo selectByPrimaryKey(Integer acctId);

    int updateByPrimaryKeySelective(TaoismAcctInfo record);

    int updateByPrimaryKey(TaoismAcctInfo record);

	TaoismAcctInfo selectByPrimaryKey(String loginAcct);

	int updatePwdByPrimaryKey(TaoismAcctInfo queryResult);
}