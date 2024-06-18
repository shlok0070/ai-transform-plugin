package com.example.aitransform.config;

import com.atlassian.plugin.spring.scanner.annotation.component.JiraComponent;
import com.atlassian.sal.api.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@JiraComponent
@Configuration
public class AiTransformPluginConfig {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    // Additional configuration beans or methods
}
