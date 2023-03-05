package com.moon.designpattern.principle.dip.good;

import java.util.List;

/**
 * @author Chanmoey
 * @date 2023年03月05日
 */
public interface IDraw {

    List<BetUser> prize(List<BetUser> list, int count);

}
