package com.moon.designpattern.principle.ocp;

import com.moon.designpattern.principle.ocp.good.CalculationArea;
import com.moon.designpattern.principle.ocp.good.CalculationAreaExt;
import com.moon.designpattern.principle.ocp.good.ICalculationArea;
import org.junit.Test;

/**
 * @author Chanmoey
 * @date 2023年03月04日
 */
public class OcpTest {

    @Test
    public void test() {
        ICalculationArea calculationArea = new CalculationArea();
        ICalculationArea calculationAreaExt = new CalculationAreaExt();
        System.out.println(calculationArea.circular(10.0));
        System.out.println(calculationAreaExt.circular(10.0));
    }
}
