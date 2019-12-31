package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbFtIndexCache;

public interface InnodbFtIndexCacheMapper {
    int insert(InnodbFtIndexCache record);

    int insertSelective(InnodbFtIndexCache record);
}