package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbTableStats;
import cn.itcast.mybatis.generator.model.InnodbTableStatsKey;

public interface InnodbTableStatsMapper {
    int deleteByPrimaryKey(InnodbTableStatsKey key);

    int insert(InnodbTableStats record);

    int insertSelective(InnodbTableStats record);

    InnodbTableStats selectByPrimaryKey(InnodbTableStatsKey key);

    int updateByPrimaryKeySelective(InnodbTableStats record);

    int updateByPrimaryKey(InnodbTableStats record);
}