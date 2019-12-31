package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.GlobalVariables;

public interface GlobalVariablesMapper {
    int insert(GlobalVariables record);

    int insertSelective(GlobalVariables record);
}