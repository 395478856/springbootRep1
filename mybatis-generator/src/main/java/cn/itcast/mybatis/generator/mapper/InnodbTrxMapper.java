package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbTrx;

public interface InnodbTrxMapper {
    int insert(InnodbTrx record);

    int insertSelective(InnodbTrx record);
}