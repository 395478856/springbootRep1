package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsWaitsCurrent;

public interface EventsWaitsCurrentMapper {
    int insert(EventsWaitsCurrent record);

    int insertSelective(EventsWaitsCurrent record);
}