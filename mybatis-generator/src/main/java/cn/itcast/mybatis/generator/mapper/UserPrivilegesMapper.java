package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.UserPrivileges;

public interface UserPrivilegesMapper {
    int insert(UserPrivileges record);

    int insertSelective(UserPrivileges record);
}