package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Event;
import cn.itcast.mybatis.generator.model.EventKey;
import cn.itcast.mybatis.generator.model.EventWithBLOBs;

public interface EventMapper {
    int deleteByPrimaryKey(EventKey key);

    int insert(EventWithBLOBs record);

    int insertSelective(EventWithBLOBs record);

    EventWithBLOBs selectByPrimaryKey(EventKey key);

    int updateByPrimaryKeySelective(EventWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EventWithBLOBs record);

    int updateByPrimaryKey(Event record);
}