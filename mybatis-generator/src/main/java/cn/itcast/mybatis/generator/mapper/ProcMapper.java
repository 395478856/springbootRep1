package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Proc;
import cn.itcast.mybatis.generator.model.ProcKey;
import cn.itcast.mybatis.generator.model.ProcWithBLOBs;

public interface ProcMapper {
    int deleteByPrimaryKey(ProcKey key);

    int insert(ProcWithBLOBs record);

    int insertSelective(ProcWithBLOBs record);

    ProcWithBLOBs selectByPrimaryKey(ProcKey key);

    int updateByPrimaryKeySelective(ProcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProcWithBLOBs record);

    int updateByPrimaryKey(Proc record);
}