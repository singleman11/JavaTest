package com.leyou.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jdbc")
public class jdbcProperties {
    private String url;
    private String driverClassName;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setdriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
