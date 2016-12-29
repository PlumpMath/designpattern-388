package com.ziroom.tech.designpattern.strategy.deligation.Impl;

import com.ziroom.tech.designpattern.strategy.deligation.ControlSyetem;

/**
 * Created by homelink on 2016/12/29.
 */
public class FerrariControlSystem implements ControlSyetem {
    @Override
    public Boolean isWorking() {
        return true;
    }

    @Override
    public String systemStart() {
        return "Ferrari controlling system is starting";
    }

    @Override
    public String systemStop() {
        return "Ferrari controlling system is stoping";
    }
}
