package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsWaitsHistory;

public interface EventsWaitsHistoryMapper {
    int insert(EventsWaitsHistory record);

    int insertSelective(EventsWaitsHistory record);
}