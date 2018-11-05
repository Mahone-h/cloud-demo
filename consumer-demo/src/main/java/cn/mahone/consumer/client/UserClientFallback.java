package cn.mahone.consumer.client;

import cn.mahone.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * describe:
 *
 * @author: Mahone
 * @creattime: 2018/11/5 17:36
 */
@Component
public class UserClientFallback implements UserClient {
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setUsername("未知用户!");

        return user;
    }
}
