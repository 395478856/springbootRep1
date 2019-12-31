package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Engines;

public interface EnginesMapper {
    int insert(Engines record);

    int insertSelective(Engines record);
}