package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Events;

public interface EventsMapper {
    int insert(Events record);

    int insertSelective(Events record);
}