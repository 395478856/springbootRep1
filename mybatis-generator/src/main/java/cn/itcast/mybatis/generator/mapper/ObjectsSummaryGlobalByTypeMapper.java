package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.ObjectsSummaryGlobalByType;

public interface ObjectsSummaryGlobalByTypeMapper {
    int insert(ObjectsSummaryGlobalByType record);

    int insertSelective(ObjectsSummaryGlobalByType record);
}