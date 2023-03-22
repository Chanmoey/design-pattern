package com.moon.designpattern.facade.bad;

import com.moon.designpattern.facade.before.domain.UserInfo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chanmoey
 * @date 2023年03月22日
 */
public class HelloWorldController {

    public UserInfo queryUserInfo(@RequestParam String userId) {
        // 做白名单拦截
        List<String> userList = new ArrayList<>();
        userList.add("1001");
        userList.add("aaaa");
        userList.add("ccc");

        if (!userList.contains(userId)) {
            return new UserInfo("1111", "非白名单可访问用户拦截！");
        }

        return new UserInfo("虫虫:" + userId, 19, "天津市南开区旮旯胡同100号");
    }
}
