package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.PerformanceTimers;

public interface PerformanceTimersMapper {
    int insert(PerformanceTimers record);

    int insertSelective(PerformanceTimers record);
}