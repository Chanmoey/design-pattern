package com.moon.designpattern.principle.isp.good.impl;

import com.moon.designpattern.principle.isp.good.ISkillArchery;
import com.moon.designpattern.principle.isp.good.ISkillInvisible;
import com.moon.designpattern.principle.isp.good.ISkillSilent;

/**
 * @author Chanmoey
 * @date 2023年03月05日
 */
public class HeroHouYi implements ISkillArchery, ISkillInvisible, ISkillSilent {

    @Override
    public void doArchery() {
        System.out.println("后裔的灼日之矢");
    }

    @Override
    public void doInvisible() {
        System.out.println("后裔的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("后裔的沉默技能");
    }

}
