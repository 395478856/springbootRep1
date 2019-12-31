package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbLocks;

public interface InnodbLocksMapper {
    int insert(InnodbLocks record);

    int insertSelective(InnodbLocks record);
}