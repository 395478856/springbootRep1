package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.FileSummaryByInstance;

public interface FileSummaryByInstanceMapper {
    int insert(FileSummaryByInstance record);

    int insertSelective(FileSummaryByInstance record);
}