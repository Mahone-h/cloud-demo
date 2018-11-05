package cn.mahone.consumer.client;

import cn.mahone.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * describe:
 *
 * @author: Mahone
 * @creattime: 2018/11/5 16:12
 */
@FeignClient(value = "user-service",fallback = UserClientFallback.class)
public interface UserClient {


    @GetMapping("user/{id}")
    User queryById(@PathVariable("id") Long id);
}
