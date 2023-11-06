package com.glanz.whitelist.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author GlanzWen
 * @Description springboot自动配置properties类
 * @github
 */

@ConfigurationProperties("com/glanz/whitelist")
public class WhiteListProperties {
    private String users;

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
