package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbSysTablestats;

public interface InnodbSysTablestatsMapper {
    int insert(InnodbSysTablestats record);

    int insertSelective(InnodbSysTablestats record);
}