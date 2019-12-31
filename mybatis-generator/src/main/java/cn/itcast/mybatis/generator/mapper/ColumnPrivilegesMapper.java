package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.ColumnPrivileges;

public interface ColumnPrivilegesMapper {
    int insert(ColumnPrivileges record);

    int insertSelective(ColumnPrivileges record);
}