package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.OptimizerTraceWithBLOBs;

public interface OptimizerTraceMapper {
    int insert(OptimizerTraceWithBLOBs record);

    int insertSelective(OptimizerTraceWithBLOBs record);
}