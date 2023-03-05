package com.moon.designpattern.principle.isp.good.impl;

import com.moon.designpattern.principle.isp.good.ISkillInvisible;
import com.moon.designpattern.principle.isp.good.ISkillSilent;
import com.moon.designpattern.principle.isp.good.ISkillVertigo;

/**
 * @author Chanmoey
 * @date 2023年03月05日
 */
public class HeroLianPo implements ISkillInvisible, ISkillSilent, ISkillVertigo {

    @Override
    public void doInvisible() {
        System.out.println("廉颇的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("廉颇的沉默技能");
    }

    @Override
    public void doVertigo() {
        System.out.println("廉颇的眩晕技能");
    }

}
