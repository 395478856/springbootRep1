package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStatementsSummaryGlobalByEventName;

public interface EventsStatementsSummaryGlobalByEventNameMapper {
    int insert(EventsStatementsSummaryGlobalByEventName record);

    int insertSelective(EventsStatementsSummaryGlobalByEventName record);
}