package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbFtDeleted;

public interface InnodbFtDeletedMapper {
    int insert(InnodbFtDeleted record);

    int insertSelective(InnodbFtDeleted record);
}