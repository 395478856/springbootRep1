package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStagesSummaryGlobalByEventName;

public interface EventsStagesSummaryGlobalByEventNameMapper {
    int insert(EventsStagesSummaryGlobalByEventName record);

    int insertSelective(EventsStagesSummaryGlobalByEventName record);
}