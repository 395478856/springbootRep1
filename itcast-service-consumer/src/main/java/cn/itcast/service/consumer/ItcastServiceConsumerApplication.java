package cn.itcast.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix*/
@SpringCloudApplication
@EnableFeignClients
public class ItcastServiceConsumerApplication {
   /* @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ItcastServiceConsumerApplication.class, args);
    }

}
