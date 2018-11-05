package cn.mahone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * describe:
 *
 * @author: Mahone
 * @creattime: 2018/11/5 18:36
 */
@SpringBootApplication
@EnableZuulProxy
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
    }
}
