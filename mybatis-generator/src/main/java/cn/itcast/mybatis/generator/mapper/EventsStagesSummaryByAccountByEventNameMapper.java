package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStagesSummaryByAccountByEventName;

public interface EventsStagesSummaryByAccountByEventNameMapper {
    int insert(EventsStagesSummaryByAccountByEventName record);

    int insertSelective(EventsStagesSummaryByAccountByEventName record);
}