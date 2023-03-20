package com.moon.designpattern.combination.good.service.engine;

import com.moon.designpattern.combination.good.service.logic.LogicFilter;
import com.moon.designpattern.combination.good.service.logic.impl.UserAgeFilter;
import com.moon.designpattern.combination.good.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Chanmoey
 * @date 2023年03月18日
 */
public class EngineConfig {

    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        this.logicFilterMap = logicFilterMap;
    }

}
