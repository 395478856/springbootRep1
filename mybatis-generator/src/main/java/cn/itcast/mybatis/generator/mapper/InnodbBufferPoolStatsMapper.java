package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbBufferPoolStats;

public interface InnodbBufferPoolStatsMapper {
    int insert(InnodbBufferPoolStats record);

    int insertSelective(InnodbBufferPoolStats record);
}