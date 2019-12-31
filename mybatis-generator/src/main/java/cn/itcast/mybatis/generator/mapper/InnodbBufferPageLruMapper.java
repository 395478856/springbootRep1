package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbBufferPageLru;

public interface InnodbBufferPageLruMapper {
    int insert(InnodbBufferPageLru record);

    int insertSelective(InnodbBufferPageLru record);
}