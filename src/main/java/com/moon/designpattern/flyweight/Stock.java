package com.moon.designpattern.flyweight;

/**
 * @author Chanmoey
 * @date 2023年03月23日
 */
public class Stock {

    /**
     * 库存总量
     */
    private int total;
    /**
     * 库存已用
     */
    private int used;

    public Stock(int total, int used) {
        this.total = total;
        this.used = used;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }
}
