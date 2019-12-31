package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.TimeZoneLeapSecond;

public interface TimeZoneLeapSecondMapper {
    int deleteByPrimaryKey(Long transitionTime);

    int insert(TimeZoneLeapSecond record);

    int insertSelective(TimeZoneLeapSecond record);

    TimeZoneLeapSecond selectByPrimaryKey(Long transitionTime);

    int updateByPrimaryKeySelective(TimeZoneLeapSecond record);

    int updateByPrimaryKey(TimeZoneLeapSecond record);
}