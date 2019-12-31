package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStagesSummaryByHostByEventName;

public interface EventsStagesSummaryByHostByEventNameMapper {
    int insert(EventsStagesSummaryByHostByEventName record);

    int insertSelective(EventsStagesSummaryByHostByEventName record);
}