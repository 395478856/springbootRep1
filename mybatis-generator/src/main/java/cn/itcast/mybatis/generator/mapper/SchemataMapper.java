package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Schemata;

public interface SchemataMapper {
    int insert(Schemata record);

    int insertSelective(Schemata record);
}