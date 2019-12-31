package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SocketSummaryByEventName;

public interface SocketSummaryByEventNameMapper {
    int insert(SocketSummaryByEventName record);

    int insertSelective(SocketSummaryByEventName record);
}