package com.moon.designpattern.principle.ocp.good;

/**
 * @author Chanmoey
 * @date 2023年03月04日
 */
public interface ICalculationArea {

    double rectangle(double x, double y);

    double triangle(double x, double y, double z);

    double circular(double r);
}
