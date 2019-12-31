package cn.itcast.service.consumer.client;

import cn.itcast.service.consumer.configuration.FeignLogConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-provider",fallback =UserClientFallBack.class,configuration = FeignLogConfiguration.class)
public interface UserClient {
    @GetMapping("provider/user/{id}")
    public String selectByPrimaryKey(@PathVariable("id") Long id);
}
