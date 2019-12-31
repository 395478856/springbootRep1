package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.TableLockWaitsSummaryByTable;

public interface TableLockWaitsSummaryByTableMapper {
    int insert(TableLockWaitsSummaryByTable record);

    int insertSelective(TableLockWaitsSummaryByTable record);
}