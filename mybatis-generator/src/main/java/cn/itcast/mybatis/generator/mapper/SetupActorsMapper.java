package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SetupActors;

public interface SetupActorsMapper {
    int insert(SetupActors record);

    int insertSelective(SetupActors record);
}