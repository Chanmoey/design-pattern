package com.moon.designpattern.facade.good.web;

import com.moon.designpattern.facade.before.domain.UserInfo;
import com.moon.designpattern.facade.good.annotation.DoDoor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chanmoey
 * @date 2023年03月22日
 */

public class HelloWroldController {

    @DoDoor(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
    @GetMapping(path = "/api/queryUserInfo")
    public UserInfo queryUserInfo(@RequestParam String userId) {
        return new UserInfo("虫虫:" + userId, 19, "天津市南开区旮旯胡同100号");
    }
}
