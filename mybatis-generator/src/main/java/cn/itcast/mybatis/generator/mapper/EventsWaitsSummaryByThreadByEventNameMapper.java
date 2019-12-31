package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsWaitsSummaryByThreadByEventName;

public interface EventsWaitsSummaryByThreadByEventNameMapper {
    int insert(EventsWaitsSummaryByThreadByEventName record);

    int insertSelective(EventsWaitsSummaryByThreadByEventName record);
}