package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbBufferPage;

public interface InnodbBufferPageMapper {
    int insert(InnodbBufferPage record);

    int insertSelective(InnodbBufferPage record);
}