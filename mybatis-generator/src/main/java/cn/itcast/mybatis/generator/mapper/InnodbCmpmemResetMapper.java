package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbCmpmemReset;

public interface InnodbCmpmemResetMapper {
    int insert(InnodbCmpmemReset record);

    int insertSelective(InnodbCmpmemReset record);
}