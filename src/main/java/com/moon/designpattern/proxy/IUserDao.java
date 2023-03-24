package com.moon.designpattern.proxy;

import com.moon.designpattern.proxy.agent.Select;

/**
 * @author Chanmoey
 * @date 2023年03月24日
 */
public interface IUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}
