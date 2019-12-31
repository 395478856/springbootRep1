package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStatementsSummaryByUserByEventName;

public interface EventsStatementsSummaryByUserByEventNameMapper {
    int insert(EventsStatementsSummaryByUserByEventName record);

    int insertSelective(EventsStatementsSummaryByUserByEventName record);
}