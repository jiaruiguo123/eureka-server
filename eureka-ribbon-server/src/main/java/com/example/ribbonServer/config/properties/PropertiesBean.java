package com.example.ribbonServer.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class PropertiesBean {

    @Value("${eureka.ribbon.uri}")
    public String ribbonUri;
}
