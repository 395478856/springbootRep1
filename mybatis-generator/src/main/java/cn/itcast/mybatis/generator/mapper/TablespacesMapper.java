package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Tablespaces;

public interface TablespacesMapper {
    int insert(Tablespaces record);

    int insertSelective(Tablespaces record);
}