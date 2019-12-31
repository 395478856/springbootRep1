package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.GeneralLogWithBLOBs;

public interface GeneralLogMapper {
    int insert(GeneralLogWithBLOBs record);

    int insertSelective(GeneralLogWithBLOBs record);
}