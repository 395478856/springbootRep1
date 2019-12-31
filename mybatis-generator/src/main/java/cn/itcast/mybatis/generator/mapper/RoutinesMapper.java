package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.RoutinesWithBLOBs;

public interface RoutinesMapper {
    int insert(RoutinesWithBLOBs record);

    int insertSelective(RoutinesWithBLOBs record);
}