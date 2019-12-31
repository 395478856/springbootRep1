package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Profiling;

public interface ProfilingMapper {
    int insert(Profiling record);

    int insertSelective(Profiling record);
}