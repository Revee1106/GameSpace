package com.eric.gamespace.taoism.dao;

import com.eric.gamespace.taoism.entity.TaoismAcctInfo;

public interface TaoismAcctInfoMapper {
    int deleteByPrimaryKey(String loginAcct);

    int insert(TaoismAcctInfo record);

    int insertSelective(TaoismAcctInfo record);

    TaoismAcctInfo selectByPrimaryKey(String loginAcct);

    int updateByPrimaryKeySelective(TaoismAcctInfo record);

    int updateByPrimaryKey(TaoismAcctInfo record);
}