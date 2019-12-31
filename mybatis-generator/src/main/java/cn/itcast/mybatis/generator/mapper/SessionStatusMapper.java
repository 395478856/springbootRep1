package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SessionStatus;

public interface SessionStatusMapper {
    int insert(SessionStatus record);

    int insertSelective(SessionStatus record);
}