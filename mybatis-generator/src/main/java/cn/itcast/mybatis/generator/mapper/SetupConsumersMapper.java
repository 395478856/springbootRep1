package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SetupConsumers;

public interface SetupConsumersMapper {
    int insert(SetupConsumers record);

    int insertSelective(SetupConsumers record);
}