package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.ZcyCodesetDivision;

public interface ZcyCodesetDivisionMapper {
    int deleteByPrimaryKey(Integer zcyCodesetDivisionId);

    int insert(ZcyCodesetDivision record);

    int insertSelective(ZcyCodesetDivision record);

    ZcyCodesetDivision selectByPrimaryKey(Integer zcyCodesetDivisionId);

    int updateByPrimaryKeySelective(ZcyCodesetDivision record);

    int updateByPrimaryKey(ZcyCodesetDivision record);
}