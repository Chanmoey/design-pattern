package com.moon.designpattern.principle.src.badcode;

import com.moon.designpattern.principle.srp.badcode.VideoUserService;
import org.junit.Test;

/**
 * @author Chanmoey
 * @date 2023年03月04日
 */
public class VideoUserServiceOcpTest {

    @Test
    public void test() {
        VideoUserService service = new VideoUserService();
        service.serveGrade("VIP用户");
        service.serveGrade("普通用户");
        service.serveGrade("访客用户");
    }
}
