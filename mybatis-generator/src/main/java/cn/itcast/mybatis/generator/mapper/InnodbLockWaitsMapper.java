package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbLockWaits;

public interface InnodbLockWaitsMapper {
    int insert(InnodbLockWaits record);

    int insertSelective(InnodbLockWaits record);
}