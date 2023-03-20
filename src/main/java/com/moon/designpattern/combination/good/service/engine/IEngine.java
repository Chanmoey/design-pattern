package com.moon.designpattern.combination.good.service.engine;

import com.moon.designpattern.combination.good.model.aggregates.TreeRich;
import com.moon.designpattern.combination.good.model.vo.EngineResult;

import java.util.Map;

/**
 * @author Chanmoey
 * @date 2023年03月18日
 */
public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
