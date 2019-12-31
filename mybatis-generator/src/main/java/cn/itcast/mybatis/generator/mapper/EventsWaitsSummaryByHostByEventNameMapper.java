package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsWaitsSummaryByHostByEventName;

public interface EventsWaitsSummaryByHostByEventNameMapper {
    int insert(EventsWaitsSummaryByHostByEventName record);

    int insertSelective(EventsWaitsSummaryByHostByEventName record);
}