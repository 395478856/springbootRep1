package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Db;
import cn.itcast.mybatis.generator.model.DbKey;

public interface DbMapper {
    int deleteByPrimaryKey(DbKey key);

    int insert(Db record);

    int insertSelective(Db record);

    Db selectByPrimaryKey(DbKey key);

    int updateByPrimaryKeySelective(Db record);

    int updateByPrimaryKey(Db record);
}