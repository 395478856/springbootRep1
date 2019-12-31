package cn.itcast.service.consumer;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = ItcastServiceConsumerApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
class BalancedTests {
    @Autowired
    private LoadBalancerClient balancerClient;
    @Test
    public void contextLoads() {
        for (int i=0;i<100;i++){
            ServiceInstance serviceInstance = balancerClient.choose("service-provider");
            System.out.println(serviceInstance.getPort());
        }
    }

}
