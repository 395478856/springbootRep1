package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.TimeZoneTransition;
import cn.itcast.mybatis.generator.model.TimeZoneTransitionKey;

public interface TimeZoneTransitionMapper {
    int deleteByPrimaryKey(TimeZoneTransitionKey key);

    int insert(TimeZoneTransition record);

    int insertSelective(TimeZoneTransition record);

    TimeZoneTransition selectByPrimaryKey(TimeZoneTransitionKey key);

    int updateByPrimaryKeySelective(TimeZoneTransition record);

    int updateByPrimaryKey(TimeZoneTransition record);
}