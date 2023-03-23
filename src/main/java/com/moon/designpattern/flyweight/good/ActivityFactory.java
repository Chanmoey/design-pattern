package com.moon.designpattern.flyweight.good;

import com.moon.designpattern.flyweight.Activity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 *
 * @author Chanmoey
 * @date 2023年03月23日
 */
public class ActivityFactory {

    static Map<Long, Activity> activityMap = new HashMap<>();

    public static Activity getActivity(Long id){
        return activityMap.computeIfAbsent(id, k -> {
            Activity activity = new Activity();
            activity.setId(10001L);
            activity.setName("图书嗨乐");
            activity.setDesc("图书优惠券分享激励分享活动第二期");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            return activity;
        });
    }
}
