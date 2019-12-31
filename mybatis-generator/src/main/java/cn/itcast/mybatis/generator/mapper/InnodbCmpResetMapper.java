package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbCmpReset;

public interface InnodbCmpResetMapper {
    int insert(InnodbCmpReset record);

    int insertSelective(InnodbCmpReset record);
}