package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Statistics;

public interface StatisticsMapper {
    int insert(Statistics record);

    int insertSelective(Statistics record);
}