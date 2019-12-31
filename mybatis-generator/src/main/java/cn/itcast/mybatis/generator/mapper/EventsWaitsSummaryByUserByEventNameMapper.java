package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsWaitsSummaryByUserByEventName;

public interface EventsWaitsSummaryByUserByEventNameMapper {
    int insert(EventsWaitsSummaryByUserByEventName record);

    int insertSelective(EventsWaitsSummaryByUserByEventName record);
}