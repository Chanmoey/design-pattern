package com.moon.designpattern.principle.ocp.good;

/**
 * 对PI的精度要求不同，通过拓展类来应对变更
 *
 * @author Chanmoey
 * @date 2023年03月04日
 */
public class CalculationAreaExt extends CalculationArea{

    private static final double PI = 3.141592653;

    @Override
    public double circular(double r) {
        return PI * r * r;
    }
}
