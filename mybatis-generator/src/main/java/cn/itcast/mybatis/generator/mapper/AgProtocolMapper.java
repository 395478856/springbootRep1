package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.AgProtocol;
import cn.itcast.mybatis.generator.model.AgProtocolWithBLOBs;

public interface AgProtocolMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AgProtocolWithBLOBs record);

    int insertSelective(AgProtocolWithBLOBs record);

    AgProtocolWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AgProtocolWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AgProtocolWithBLOBs record);

    int updateByPrimaryKey(AgProtocol record);
}