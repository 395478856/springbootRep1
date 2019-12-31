package cn.itcast.service.consumer.client;

import org.springframework.stereotype.Component;

@Component
public class UserClientFallBack implements UserClient {
    @Override
    public String selectByPrimaryKey(Long id) {
        return "崩溃了皮卡丘！！！";
    }
}
