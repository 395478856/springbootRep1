package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbCmpmem;

public interface InnodbCmpmemMapper {
    int insert(InnodbCmpmem record);

    int insertSelective(InnodbCmpmem record);
}