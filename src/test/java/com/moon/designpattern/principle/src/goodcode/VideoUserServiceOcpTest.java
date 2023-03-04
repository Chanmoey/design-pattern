package com.moon.designpattern.principle.src.goodcode;

import com.moon.designpattern.principle.srp.goodcode.IVideoUserService;
import com.moon.designpattern.principle.srp.goodcode.impl.ViPVideoUserService;
import org.junit.Test;

/**
 * @author Chanmoey
 * @date 2023年03月04日
 */
public class VideoUserServiceOcpTest {

    @Test
    public void test() {
        IVideoUserService vip = new ViPVideoUserService();
        vip.advertisement();
        vip.definition();
    }
}
