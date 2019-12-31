package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SocketSummaryByInstance;

public interface SocketSummaryByInstanceMapper {
    int insert(SocketSummaryByInstance record);

    int insertSelective(SocketSummaryByInstance record);
}