package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStatementsSummaryByAccountByEventName;

public interface EventsStatementsSummaryByAccountByEventNameMapper {
    int insert(EventsStatementsSummaryByAccountByEventName record);

    int insertSelective(EventsStatementsSummaryByAccountByEventName record);
}