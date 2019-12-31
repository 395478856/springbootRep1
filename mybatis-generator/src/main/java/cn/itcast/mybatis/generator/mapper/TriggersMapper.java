package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.TriggersWithBLOBs;

public interface TriggersMapper {
    int insert(TriggersWithBLOBs record);

    int insertSelective(TriggersWithBLOBs record);
}