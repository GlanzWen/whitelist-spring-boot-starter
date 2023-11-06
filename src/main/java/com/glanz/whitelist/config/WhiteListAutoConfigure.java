package com.glanz.whitelist.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author GlanzWen
 * @Description springboot自动配置AutoConfigure类
 * @github
 */

@Configuration
@ConditionalOnClass(WhiteListProperties.class)
@EnableConfigurationProperties(WhiteListProperties.class)
public class WhiteListAutoConfigure {

    @Bean
    @ConditionalOnMissingBean
    public String whiteListConfig(WhiteListProperties properties) {
        return properties.getUsers();
    }
}
