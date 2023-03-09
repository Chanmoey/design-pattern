package com.moon.designpattern.builder.before.ceilling;

import com.moon.designpattern.builder.before.Matter;

import java.math.BigDecimal;

/**
 * @author Chanmoey
 * @date 2023年03月09日
 */
public class LevelTwoCeiling  implements Matter {

    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "装修公司自带";
    }

    public String model() {
        return "二级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(850);
    }

    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般就往下吊20cm，要是层高很高，也可增加每级的厚度";
    }
}
