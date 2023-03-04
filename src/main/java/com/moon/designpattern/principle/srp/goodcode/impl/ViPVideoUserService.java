package com.moon.designpattern.principle.srp.goodcode.impl;

import com.moon.designpattern.principle.srp.goodcode.IVideoUserService;

/**
 * @author Chanmoey
 * @date 2023年03月04日
 */
public class ViPVideoUserService implements IVideoUserService {

    @Override
    public void definition() {
        System.out.println("VIP用户, 视频1080P蓝光");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP用户, 无广告");
    }
}
