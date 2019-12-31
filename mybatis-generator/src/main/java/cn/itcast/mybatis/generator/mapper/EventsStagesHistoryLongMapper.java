package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStagesHistoryLong;

public interface EventsStagesHistoryLongMapper {
    int insert(EventsStagesHistoryLong record);

    int insertSelective(EventsStagesHistoryLong record);
}