package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStatementsHistoryLongWithBLOBs;

public interface EventsStatementsHistoryLongMapper {
    int insert(EventsStatementsHistoryLongWithBLOBs record);

    int insertSelective(EventsStatementsHistoryLongWithBLOBs record);
}