package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.TimeZone;

public interface TimeZoneMapper {
    int deleteByPrimaryKey(Integer timeZoneId);

    int insert(TimeZone record);

    int insertSelective(TimeZone record);

    TimeZone selectByPrimaryKey(Integer timeZoneId);

    int updateByPrimaryKeySelective(TimeZone record);

    int updateByPrimaryKey(TimeZone record);
}