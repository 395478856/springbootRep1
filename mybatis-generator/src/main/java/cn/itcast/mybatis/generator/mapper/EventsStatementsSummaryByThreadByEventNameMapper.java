package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStatementsSummaryByThreadByEventName;

public interface EventsStatementsSummaryByThreadByEventNameMapper {
    int insert(EventsStatementsSummaryByThreadByEventName record);

    int insertSelective(EventsStatementsSummaryByThreadByEventName record);
}