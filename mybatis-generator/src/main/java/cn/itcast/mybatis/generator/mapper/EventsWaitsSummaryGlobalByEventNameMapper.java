package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsWaitsSummaryGlobalByEventName;

public interface EventsWaitsSummaryGlobalByEventNameMapper {
    int insert(EventsWaitsSummaryGlobalByEventName record);

    int insertSelective(EventsWaitsSummaryGlobalByEventName record);
}