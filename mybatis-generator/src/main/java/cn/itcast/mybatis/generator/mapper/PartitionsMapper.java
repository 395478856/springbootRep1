package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.PartitionsWithBLOBs;

public interface PartitionsMapper {
    int insert(PartitionsWithBLOBs record);

    int insertSelective(PartitionsWithBLOBs record);
}