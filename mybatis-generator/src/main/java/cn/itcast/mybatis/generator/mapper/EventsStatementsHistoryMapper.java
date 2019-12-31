package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStatementsHistoryWithBLOBs;

public interface EventsStatementsHistoryMapper {
    int insert(EventsStatementsHistoryWithBLOBs record);

    int insertSelective(EventsStatementsHistoryWithBLOBs record);
}