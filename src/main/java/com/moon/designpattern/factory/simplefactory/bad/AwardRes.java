package com.moon.designpattern.factory.simplefactory.bad;

/**
 * @author Chanmoey
 * @date 2023年03月07日
 */
public class AwardRes {

    private String code; // 编码
    private String info; // 描述

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
