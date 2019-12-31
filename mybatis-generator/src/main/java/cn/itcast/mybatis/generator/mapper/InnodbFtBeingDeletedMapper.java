package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbFtBeingDeleted;

public interface InnodbFtBeingDeletedMapper {
    int insert(InnodbFtBeingDeleted record);

    int insertSelective(InnodbFtBeingDeleted record);
}