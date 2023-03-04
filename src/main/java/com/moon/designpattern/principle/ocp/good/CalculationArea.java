package com.moon.designpattern.principle.ocp.good;

/**
 * @author Chanmoey
 * @date 2023年03月04日
 */
public class CalculationArea implements ICalculationArea{

    private static final double PI = 3.14;

    @Override
    public double rectangle(double x, double y) {
        return x * y;
    }

    @Override
    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double circular(double r) {
        return PI * r * r;
    }
}
