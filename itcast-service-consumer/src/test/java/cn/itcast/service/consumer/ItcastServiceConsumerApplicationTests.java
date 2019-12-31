package cn.itcast.service.consumer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

@SpringBootTest
class ItcastServiceConsumerApplicationTests {
    @Autowired
    private LoadBalancerClient balancerClient;
    @Test
    void contextLoads() {
        ServiceInstance serviceInstance = balancerClient.choose("service-provider");
        for (int i=0;i<100;i++){
            System.out.println(serviceInstance.getPort());
        }
    }

}
