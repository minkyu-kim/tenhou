package com.kkmkkm.tenhou.config.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.payco.adnetwork.shared.web.config.web.statics.StaticInterceptor;
import com.payco.adnetwork.shared.web.config.web.statics.StaticUrlProperties;
import com.payco.adnetwork.shared.web.error.ErrorController;
import com.payco.adnetwork.shared.web.error.JasperExceptionInterceptor;
import com.payco.adnetwork.shared.web.health.SimpleHealthChecker;
import com.payco.adnetwork.web.config.web.client.ClientArgumentResolver;
import com.payco.adnetwork.web.config.web.client.ClientInterceptor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final ObjectMapper objectMapper;

    @Autowired
    public WebConfig(@NonNull ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
    }
}
