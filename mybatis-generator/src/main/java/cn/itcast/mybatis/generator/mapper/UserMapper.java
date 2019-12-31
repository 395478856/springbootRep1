package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.User;
import cn.itcast.mybatis.generator.model.UserKey;
import cn.itcast.mybatis.generator.model.UserWithBLOBs;

public interface UserMapper {
    int deleteByPrimaryKey(UserKey key);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    UserWithBLOBs selectByPrimaryKey(UserKey key);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
}