package com.moon.designpattern.principle.dip.good;

import java.util.List;

/**
 * @author Chanmoey
 * @date 2023年03月05日
 */
public class DrawControl {

    private IDraw draw;

    public List<BetUser> doDraw(IDraw draw, List<BetUser> betUserList, int count) {
        return draw.prize(betUserList, count);
    }

}