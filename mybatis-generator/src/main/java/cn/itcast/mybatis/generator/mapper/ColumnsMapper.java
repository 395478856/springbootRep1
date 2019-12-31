package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.ColumnsWithBLOBs;

public interface ColumnsMapper {
    int insert(ColumnsWithBLOBs record);

    int insertSelective(ColumnsWithBLOBs record);
}