package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.FileSummaryByEventName;

public interface FileSummaryByEventNameMapper {
    int insert(FileSummaryByEventName record);

    int insertSelective(FileSummaryByEventName record);
}