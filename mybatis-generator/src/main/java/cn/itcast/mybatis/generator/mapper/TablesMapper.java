package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Tables;

public interface TablesMapper {
    int insert(Tables record);

    int insertSelective(Tables record);
}