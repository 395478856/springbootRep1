package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.RwlockInstances;

public interface RwlockInstancesMapper {
    int insert(RwlockInstances record);

    int insertSelective(RwlockInstances record);
}