package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SessionVariables;

public interface SessionVariablesMapper {
    int insert(SessionVariables record);

    int insertSelective(SessionVariables record);
}