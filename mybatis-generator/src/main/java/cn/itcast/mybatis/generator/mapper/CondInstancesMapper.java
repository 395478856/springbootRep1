package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.CondInstances;

public interface CondInstancesMapper {
    int insert(CondInstances record);

    int insertSelective(CondInstances record);
}