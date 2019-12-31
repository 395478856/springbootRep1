package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStagesHistory;

public interface EventsStagesHistoryMapper {
    int insert(EventsStagesHistory record);

    int insertSelective(EventsStagesHistory record);
}