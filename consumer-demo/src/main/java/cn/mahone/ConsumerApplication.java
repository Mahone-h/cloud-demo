package cn.mahone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * describe:
 *
 * @author: Mahone
 * @creattime: 2018/10/31 22:21
 */
//@EnableCircuitBreaker
//@EnableDiscoveryClient
//@SpringBootApplication
@SpringCloudApplication
@EnableFeignClients
public class ConsumerApplication {
    //@Bean
    //@LoadBalanced   //内置拦截器拦截请求  负载均衡
    //public RestTemplate restTemplate(){
    //    return new RestTemplate();
    //}

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
