package cn.easygo.mall.basic.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/***
 * @ClassName: DocumentationConfig
 * @Description:
 * @Auther: glw
 * @Date: 2019/1/27 10:31
 * @version : V1.0
 */
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider{

    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<>();
        //product,user等都是网关中配置路径,而且如果有前缀,需要加上
        resources.add(swaggerResource("平台管理", "/services/plat/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
