package cn.easygo.mall.plat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * @ClassName: PlatServiceApplication
 * @Description:
 * @Auther: glw
 * @Date: 2019/1/27 9:32
 * @version : V1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PlatServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication.class, args);
    }
}
