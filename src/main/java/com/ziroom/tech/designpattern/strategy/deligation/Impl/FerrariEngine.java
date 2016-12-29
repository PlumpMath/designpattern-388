package com.ziroom.tech.designpattern.strategy.deligation.Impl;

import com.ziroom.tech.designpattern.strategy.deligation.Engine;

/**
 * Created by homelink on 2016/12/29.
 */
public class FerrariEngine implements Engine {
    @Override
    public Boolean isWorking() {
        return true;
    }

    @Override
    public String engineStart() {
        return "Ferrari engine is starting";
    }

    @Override
    public String engineStop() {
        return "Ferrari engine is stoping";
    }
}
