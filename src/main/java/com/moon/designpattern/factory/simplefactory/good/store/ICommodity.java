package com.moon.designpattern.factory.simplefactory.good.store;

import java.util.Map;

/**
 * @author Chanmoey
 * @date 2023年03月07日
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
