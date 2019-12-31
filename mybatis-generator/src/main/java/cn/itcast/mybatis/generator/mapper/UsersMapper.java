package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Users;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);
}