package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbMetrics;

public interface InnodbMetricsMapper {
    int insert(InnodbMetrics record);

    int insertSelective(InnodbMetrics record);
}