package com.moon.designpattern.principle.srp.goodcode.impl;

import com.moon.designpattern.principle.srp.goodcode.IVideoUserService;

/**
 * @author Chanmoey
 * @date 2023年03月04日
 */
public class OrdinaryVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("普通用户, 视频720P超清");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户, 视频有广告");
    }
}
