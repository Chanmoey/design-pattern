package com.moon.designpattern.principle.srp.badcode;

/**
 * 场景：每个用户有不同的权限
 *
 * @author Chanmoey
 * @date 2023年03月04日
 */
public class VideoUserService {

    public void serveGrade(String userType) {
        if ("VIP用户".equals(userType)) {
            System.out.println("VIP, 视频1080P蓝光");
        } else if ("普通用户".equals(userType)) {
            System.out.println("普通用户, 视频720P超清");
        } else if ("访客用户".equals(userType)) {
            System.out.println("访客用户，视频480P高清");
        }
    }
}
