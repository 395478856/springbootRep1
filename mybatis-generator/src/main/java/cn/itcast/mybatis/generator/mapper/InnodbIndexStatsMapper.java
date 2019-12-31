package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbIndexStats;
import cn.itcast.mybatis.generator.model.InnodbIndexStatsKey;

public interface InnodbIndexStatsMapper {
    int deleteByPrimaryKey(InnodbIndexStatsKey key);

    int insert(InnodbIndexStats record);

    int insertSelective(InnodbIndexStats record);

    InnodbIndexStats selectByPrimaryKey(InnodbIndexStatsKey key);

    int updateByPrimaryKeySelective(InnodbIndexStats record);

    int updateByPrimaryKey(InnodbIndexStats record);
}