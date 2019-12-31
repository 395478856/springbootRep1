package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.MutexInstances;

public interface MutexInstancesMapper {
    int insert(MutexInstances record);

    int insertSelective(MutexInstances record);
}