package com.crud_demo.Config;

import com.crud_demo.component.LoginHandlerinterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerinterceptor())
                .addPathPatterns("/**") //通过判断是否有@LoginRequired注解 决定是否需要登录
//                .excludePathPatterns("/user","/login","/login","/login/**","/assets/**","/css/**","js/**","/dashboard",
//                        "line","/sys/echarts/line","/sups/**","/suppliers","/supCats",
//                        "/searchName/**","/**")
                        ;
    }
    //这块程序？
    @Bean
    public LoginHandlerinterceptor authenticationInterceptor() {
        return new LoginHandlerinterceptor();
    }
}
