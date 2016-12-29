package com.ziroom.tech.designpattern.strategy.deligation.Impl;

import com.ziroom.tech.designpattern.strategy.deligation.ControlSyetem;

/**
 * Created by homelink on 2016/12/29.
 */
public class VolkswagenControlSystem implements ControlSyetem {
    @Override
    public Boolean isWorking() {
        return true;
    }

    @Override
    public String systemStart() {
        return "Volkswagen controlling system is starting";
    }

    @Override
    public String systemStop() {
        return "Volkswagen controlling system is stoping";
    }
}
