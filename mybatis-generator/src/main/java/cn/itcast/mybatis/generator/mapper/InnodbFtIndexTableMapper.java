package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbFtIndexTable;

public interface InnodbFtIndexTableMapper {
    int insert(InnodbFtIndexTable record);

    int insertSelective(InnodbFtIndexTable record);
}