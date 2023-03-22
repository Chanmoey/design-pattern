package com.moon.designpattern.facade.good.config;

import org.springframework.util.StringUtils;

/**
 * @author Chanmoey
 * @date 2023年03月22日
 */
public class StarterService {

    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }
}
