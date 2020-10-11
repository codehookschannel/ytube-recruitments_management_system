package com.codehooks.rms.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoggerConfigs implements WebMvcConfigurer {

    @Autowired
    private LoggerInterceptor logger;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logger)
                .addPathPatterns("/**");
    }
}
