package cn.itcast.service.consumer.controller;

import cn.itcast.service.consumer.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer/user")
//@DefaultProperties(defaultFallback = "defaultFallback")
public class UserController {
    //    private final RestTemplate restTemplate;
    private final UserClient userClient;

    //    private final DiscoveryClient discoveryClient;
//    private final LoadBalancerClient balancerClient;
    @Autowired
    public UserController( UserClient userClient) {
//        this.restTemplate = restTemplate;
//        this.discoveryClient = discoveryClient;
//        this.balancerClient = balancerClient;
        this.userClient = userClient;
    }

    @GetMapping("{id}")
    public String selectByPrimaryKey(@PathVariable("id") Long id) {
       return userClient.selectByPrimaryKey(id);
    }



  /*  @GetMapping("{id}")
//    @HystrixCommand(fallbackMethod = "fallBack")
    @HystrixCommand
    public String selectByPrimaryKey(@PathVariable("id") Long id) {
        if (id == 1) {
            throw new RuntimeException("太忙了");
        }
        return restTemplate.getForObject("http://service-provider/provider/user/" + id, String.class);
    }*/
   /* @GetMapping("{id}")
    public User selectByPrimaryKey(@PathVariable("id") Long id){
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("service-provider");
        ServiceInstance serviceInstance = serviceInstances.get(0);
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        System.out.println(host+":"+port);
        return restTemplate.getForObject("http://"+host+":"+port+"/provider/user/"+id, User.class);
    }*/
/*
   public String fallBack(Long id){
       return "请求繁忙，请稍后再试！";
   }

    public String defaultFallback(){
        return "请求繁忙11111，请稍后再试！";
    }*/
}
