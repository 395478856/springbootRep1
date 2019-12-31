package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.TablePrivileges;

public interface TablePrivilegesMapper {
    int insert(TablePrivileges record);

    int insertSelective(TablePrivileges record);
}