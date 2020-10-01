package com.eric.gamespace.taoism.dao;

import java.util.List;

import com.eric.gamespace.taoism.entity.TaoismParamInfo;

public interface TaoismParamInfoMapper {
    int insert(TaoismParamInfo record);

    int insertSelective(TaoismParamInfo record);

	List<TaoismParamInfo> selectByParamType(String paramType);
}