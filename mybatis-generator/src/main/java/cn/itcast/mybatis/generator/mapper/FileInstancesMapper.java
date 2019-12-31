package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.FileInstances;

public interface FileInstancesMapper {
    int insert(FileInstances record);

    int insertSelective(FileInstances record);
}