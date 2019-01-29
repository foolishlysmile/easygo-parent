package cn.easygo.mall.basic.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/***
 * @ClassName: SwaggerConfigBean
 * @Description:
 * @Auther: glw
 * @Date: 2019/1/27 10:30
 * @version : V1.0
 */
@SpringBootConfiguration
@EnableSwagger2
public class SwaggerConfigBean {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("分布式购物系统")
                .description("购物系统接口文档说明")
                .termsOfServiceUrl("http://localhost:8081")
                .contact(new Contact("yphtest", "", "yhp@itsoruce.cn"))
                .version("1.0")
                .build();
    }
}
