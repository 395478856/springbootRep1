package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Parameters;

public interface ParametersMapper {
    int insert(Parameters record);

    int insertSelective(Parameters record);
}