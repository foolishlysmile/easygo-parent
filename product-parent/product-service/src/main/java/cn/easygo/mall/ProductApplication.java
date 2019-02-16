package cn.easygo.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * @ClassName: ProductApplication
 * @Description:
 * @Auther: glw
 * @Date: 2019/2/14 12:04
 * @version : V1.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.easygo.mall.mapper")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
