package com.moon.designpattern.builder.good;

import com.moon.designpattern.builder.before.ceilling.LevelOneCeiling;
import com.moon.designpattern.builder.before.ceilling.LevelTwoCeiling;
import com.moon.designpattern.builder.before.coat.DuluxCoat;
import com.moon.designpattern.builder.before.coat.LiBangCoat;
import com.moon.designpattern.builder.before.floor.ShengXiangFloor;
import com.moon.designpattern.builder.before.tile.DongPengTile;
import com.moon.designpattern.builder.before.tile.MarcoPoloTile;

/**
 * @author Chanmoey
 * @date 2023年03月09日
 */
public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，一级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }

}
