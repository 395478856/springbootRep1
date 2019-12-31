package cn.itcast.service.provider.service;

import cn.itcast.service.provider.pojo.User;

public interface UserService {
    User selectByPrimaryKey(Long id);
}
