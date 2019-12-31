package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SlowLogWithBLOBs;

public interface SlowLogMapper {
    int insert(SlowLogWithBLOBs record);

    int insertSelective(SlowLogWithBLOBs record);
}