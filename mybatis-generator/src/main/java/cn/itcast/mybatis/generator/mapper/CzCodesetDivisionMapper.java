package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.CzCodesetDivision;

public interface CzCodesetDivisionMapper {
    int deleteByPrimaryKey(Integer czCodesetDivisionId);

    int insert(CzCodesetDivision record);

    int insertSelective(CzCodesetDivision record);

    CzCodesetDivision selectByPrimaryKey(Integer czCodesetDivisionId);

    int updateByPrimaryKeySelective(CzCodesetDivision record);

    int updateByPrimaryKey(CzCodesetDivision record);
}