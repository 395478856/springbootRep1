package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsWaitsHistoryLong;

public interface EventsWaitsHistoryLongMapper {
    int insert(EventsWaitsHistoryLong record);

    int insertSelective(EventsWaitsHistoryLong record);
}