package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbFtConfig;

public interface InnodbFtConfigMapper {
    int insert(InnodbFtConfig record);

    int insertSelective(InnodbFtConfig record);
}