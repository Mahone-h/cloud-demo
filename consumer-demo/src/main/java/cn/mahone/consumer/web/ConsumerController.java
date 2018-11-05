package cn.mahone.consumer.web;

import cn.mahone.consumer.client.UserClient;
import cn.mahone.consumer.pojo.User;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancedRetryFactory;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * describe:
 *
 * @author: Mahone
 * @creattime: 2018/10/31 22:24
 */
@RestController
@RequestMapping("consumer")
//@DefaultProperties(defaultFallback = "queryByIdFallback")
public class ConsumerController {
    //@Autowired
    //private RestTemplate restTemplate;

    //@Autowired
    //private DiscoveryClient discoveryClient;
    //@Autowired
    //private RibbonLoadBalancerClient client;

    //@HystrixCommand(fallbackMethod = "queryByIdFallback")

    //配置超时时长
    //@GetMapping("{id}")
    //@HystrixCommand(commandProperties = {
    //        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")//超时时间
    //})

    @Autowired
    private UserClient userClient;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userClient.queryById(id);
    }

    public String queryByIdFallback() {
        return "不好意思,服务器太拥挤了!";
    }

    //@GetMapping("{id}")
    //public User queryById(@PathVariable("id") Long id) {
    //    //根据服务id获取实例
    //    //List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
    //    //从实例中取出ip和端口
    //    //ServiceInstance instance = instances.get(0);
    //    //随机\轮询\hash
    //    //默认是轮询
    //   负载均衡复杂方法
    //    // ServiceInstance instance = client.choose("user-service");
    //    // String url = "http://"+instance.getHost()+":"+instance.getPort()+"/user/"+ id;
    //
    //    String url = "http://user-service/user/" + id;
    //    System.out.println(url);
    //    User user = restTemplate.getForObject(url, User.class);
    //    return user;
    //}

    //测试熔断
    //@HystrixCommand(
    //        commandProperties = {
    //            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"), //熔断阈值,
    //            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//休眠时间窗
    //            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60") //错误百分比
    //})
    //public String queryById(@PathVariable("id") Long id) {
    //    //手动控制休眠
    //    if(id%2==0){
    //        throw new RuntimeException();
    //    }
    //
    //    String url = "http://user-service/user/" + id;
    //    System.out.println(url);
    //    String user = restTemplate.getForObject(url, String.class);
    //    return user;
    //}
}
