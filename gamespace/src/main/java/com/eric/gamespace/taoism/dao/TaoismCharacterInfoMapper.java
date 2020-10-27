package com.eric.gamespace.taoism.dao;

import com.eric.gamespace.taoism.entity.TaoismCharacterInfo;
import com.eric.gamespace.taoism.entity.TaoismCharacterInfoKey;

public interface TaoismCharacterInfoMapper {
    int deleteByPrimaryKey(TaoismCharacterInfoKey key);

    int insert(TaoismCharacterInfo record);

    int insertSelective(TaoismCharacterInfo record);

    TaoismCharacterInfo selectByPrimaryKey(TaoismCharacterInfoKey key);

    int updateByPrimaryKeySelective(TaoismCharacterInfo record);

    int updateByPrimaryKey(TaoismCharacterInfo record);
}