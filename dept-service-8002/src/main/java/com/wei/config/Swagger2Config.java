package com.wei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.wei.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder().title("部门微服务业务")
                .description("详情1111")
                .contact("联系方式")
                .license("证书")
                .version("999")
                .build();
    }
}
