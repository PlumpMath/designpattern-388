package com.ziroom.tech.designpattern.strategy.deligation.Impl;

import com.ziroom.tech.designpattern.strategy.deligation.Wheels;

/**
 * Created by homelink on 2016/12/29.
 */
public class VolkswagenWheels implements Wheels {
    @Override
    public String wheelsInfo() {
        return "Current wheel is suitable for Volkswagen";
    }
}
