package com.dj.pms.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.api")
@Data
public class ApiConfig {

    Integer gap;

    Boolean displayRequest;
}
