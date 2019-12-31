package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SchemaPrivileges;

public interface SchemaPrivilegesMapper {
    int insert(SchemaPrivileges record);

    int insertSelective(SchemaPrivileges record);
}