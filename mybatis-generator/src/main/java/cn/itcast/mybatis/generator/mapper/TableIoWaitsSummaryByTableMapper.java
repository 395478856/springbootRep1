package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.TableIoWaitsSummaryByTable;

public interface TableIoWaitsSummaryByTableMapper {
    int insert(TableIoWaitsSummaryByTable record);

    int insertSelective(TableIoWaitsSummaryByTable record);
}