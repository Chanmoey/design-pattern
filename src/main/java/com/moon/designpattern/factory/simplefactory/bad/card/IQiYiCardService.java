package com.moon.designpattern.factory.simplefactory.bad.card;

/**
 * @author Chanmoey
 * @date 2023年03月07日
 */
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }

}
