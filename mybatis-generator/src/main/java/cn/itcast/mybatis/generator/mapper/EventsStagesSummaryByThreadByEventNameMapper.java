package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStagesSummaryByThreadByEventName;

public interface EventsStagesSummaryByThreadByEventNameMapper {
    int insert(EventsStagesSummaryByThreadByEventName record);

    int insertSelective(EventsStagesSummaryByThreadByEventName record);
}