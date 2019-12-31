package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Accounts;

public interface AccountsMapper {
    int insert(Accounts record);

    int insertSelective(Accounts record);
}