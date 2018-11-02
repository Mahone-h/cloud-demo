package cn.mahone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * describe:
 *
 * @author: Mahone
 * @creattime: 2018/10/31 22:07
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.mahone.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
