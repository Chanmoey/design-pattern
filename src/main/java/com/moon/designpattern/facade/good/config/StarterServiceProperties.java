package com.moon.designpattern.facade.good.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Chanmoey
 * @date 2023年03月22日
 */
@ConfigurationProperties("itstack.door")
public class StarterServiceProperties {

    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }
}
