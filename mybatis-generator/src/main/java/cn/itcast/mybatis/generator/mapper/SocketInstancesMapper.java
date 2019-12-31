package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SocketInstances;

public interface SocketInstancesMapper {
    int insert(SocketInstances record);

    int insertSelective(SocketInstances record);
}