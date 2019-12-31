package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbSysIndexes;

public interface InnodbSysIndexesMapper {
    int insert(InnodbSysIndexes record);

    int insertSelective(InnodbSysIndexes record);
}