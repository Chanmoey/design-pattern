package com.moon.designpattern.principle.srp.goodcode.impl;

import com.moon.designpattern.principle.srp.goodcode.IVideoUserService;

/**
 * @author Chanmoey
 * @date 2023年03月04日
 */
public class GuestVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("访客用户，视频480P高清");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }
}
