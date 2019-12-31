package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStatementsCurrentWithBLOBs;

public interface EventsStatementsCurrentMapper {
    int insert(EventsStatementsCurrentWithBLOBs record);

    int insertSelective(EventsStatementsCurrentWithBLOBs record);
}