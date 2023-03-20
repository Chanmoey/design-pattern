package com.moon.designpattern.combination.good.service.engine.impl;

import com.moon.designpattern.combination.good.model.aggregates.TreeRich;
import com.moon.designpattern.combination.good.model.vo.EngineResult;
import com.moon.designpattern.combination.good.model.vo.TreeNode;
import com.moon.designpattern.combination.good.service.engine.EngineBase;

import java.util.Map;

/**
 * @author Chanmoey
 * @date 2023年03月18日
 */
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
