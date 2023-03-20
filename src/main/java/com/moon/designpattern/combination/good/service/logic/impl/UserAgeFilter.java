package com.moon.designpattern.combination.good.service.logic.impl;

import com.moon.designpattern.combination.good.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author Chanmoey
 * @date 2023年03月18日
 */
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }

}
