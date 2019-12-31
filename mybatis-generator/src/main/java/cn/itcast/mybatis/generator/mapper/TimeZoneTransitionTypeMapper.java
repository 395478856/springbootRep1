package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.TimeZoneTransitionType;
import cn.itcast.mybatis.generator.model.TimeZoneTransitionTypeKey;

public interface TimeZoneTransitionTypeMapper {
    int deleteByPrimaryKey(TimeZoneTransitionTypeKey key);

    int insert(TimeZoneTransitionType record);

    int insertSelective(TimeZoneTransitionType record);

    TimeZoneTransitionType selectByPrimaryKey(TimeZoneTransitionTypeKey key);

    int updateByPrimaryKeySelective(TimeZoneTransitionType record);

    int updateByPrimaryKey(TimeZoneTransitionType record);
}