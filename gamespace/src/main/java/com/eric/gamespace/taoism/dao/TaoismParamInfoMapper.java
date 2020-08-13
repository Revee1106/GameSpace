package com.eric.gamespace.taoism.dao;

import java.util.List;

import com.eric.gamespace.taoism.entity.TaoismParamInfo;

public interface TaoismParamInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaoismParamInfo record);

    int insertSelective(TaoismParamInfo record);

    TaoismParamInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaoismParamInfo record);

    int updateByPrimaryKey(TaoismParamInfo record);

	List<TaoismParamInfo> selectByParamType(String paramType);
}