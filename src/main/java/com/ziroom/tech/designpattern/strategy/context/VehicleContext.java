package com.ziroom.tech.designpattern.strategy.context;

import com.ziroom.tech.designpattern.strategy.deligation.ControlSyetem;
import com.ziroom.tech.designpattern.strategy.deligation.Engine;
import com.ziroom.tech.designpattern.strategy.deligation.Wheels;
import com.ziroom.tech.designpattern.strategy.interfacepackage.ContextInterface;

/**
 * 策略模式的具体主体的接口实现，可以是具体的不同的抽象接口
 * Created by LD.
 *
 * @date 28/12/2016.
 */
public abstract class VehicleContext implements ContextInterface {

    // 功能的实现需要委托的对象
    public ControlSyetem controlSyetem;
    public Engine engine;
    public Wheels wheels;

    public abstract void engineStart();

    public abstract void wheelsInfo();

    public abstract void controSystemCheck();

    @Override
    public String toString() {
        return "";
    }
}
