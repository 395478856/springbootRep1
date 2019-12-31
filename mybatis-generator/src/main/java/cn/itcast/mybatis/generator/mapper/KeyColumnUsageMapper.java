package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.KeyColumnUsage;

public interface KeyColumnUsageMapper {
    int insert(KeyColumnUsage record);

    int insertSelective(KeyColumnUsage record);
}