package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsWaitsSummaryByInstance;

public interface EventsWaitsSummaryByInstanceMapper {
    int insert(EventsWaitsSummaryByInstance record);

    int insertSelective(EventsWaitsSummaryByInstance record);
}