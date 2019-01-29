package cn.easygo.mall.plat.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/***
 * @ClassName: ConfigBean
 * @Description:
 * @Auther: glw
 * @Date: 2019/1/27 10:25
 * @version : V1.0
 */
@SpringBootConfiguration
@EnableSwagger2
public class ConfigBean {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.easygo.mall.plat.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("平台服务api")
                .description("平台服务接口文档说明")
                .contact(new Contact("glw", "", " glw869049703@163.com"))
                .version("1.0")
                .build();
    }
}
