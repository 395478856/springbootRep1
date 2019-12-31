package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbSysForeignCols;

public interface InnodbSysForeignColsMapper {
    int insert(InnodbSysForeignCols record);

    int insertSelective(InnodbSysForeignCols record);
}