package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.HelpRelationKey;

public interface HelpRelationMapper {
    int deleteByPrimaryKey(HelpRelationKey key);

    int insert(HelpRelationKey record);

    int insertSelective(HelpRelationKey record);
}