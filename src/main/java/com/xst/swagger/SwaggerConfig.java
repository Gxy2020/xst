package com.xst.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GUO
 * @Classname SwaggerConfig
 * @Description TODO
 * @Date 2020/11/16 22:23
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${swagger2.enable}")
    private boolean enable;
    @Bean
    public Docket createDocket(){
        List<Parameter> parameterList=new ArrayList<>();
        ParameterBuilder parameterBuilder=new ParameterBuilder();
        parameterBuilder.name("SESSION").description("swagger调试(模拟传入用户凭证)").modelRef(new ModelRef("String"))
                .required(false);
//        parameterBuilder.name("SESSION").description("swagger调试(模拟传入用户凭证)").modelRef(new ModelRef("String"))
//                .parameterType("header").required(false);

        parameterList.add(parameterBuilder.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xst.controller"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(parameterList)
                .enable(enable);
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("学思通系统后端接口")
                .description("springboot 2.x+Swagger.enable")
                .version("1.0")
                .build();
    }
}