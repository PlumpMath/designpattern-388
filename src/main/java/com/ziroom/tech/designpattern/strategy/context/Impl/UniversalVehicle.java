package com.ziroom.tech.designpattern.strategy.context.Impl;

import com.ziroom.tech.designpattern.strategy.context.VehicleContext;
import com.ziroom.tech.designpattern.strategy.deligation.ControlSyetem;
import com.ziroom.tech.designpattern.strategy.deligation.Engine;
import com.ziroom.tech.designpattern.strategy.deligation.Wheels;

/**
 * 这个类和 FerrariVehicle和VolkswagenVehicle相比更具有普遍性，我们可以通过对构造参数传入不同的
 * Engine/ ControlSystem/ Wheels 创造不同种类的 Vehicle，更符合设计模式的原则
 * Created by homelink on 2016/12/29.
 */
public class UniversalVehicle extends VehicleContext{

    public UniversalVehicle(Engine engine, ControlSyetem controlSyetem, Wheels wheels) {
        this.engine = engine;
        this.controlSyetem = controlSyetem;
        this.wheels = wheels;
    }

    @Override
    public void engineStart() {
        if (engine.isWorking()) {
            System.out.println(engine.engineStart());
        } else {
            System.out.println(engine.engineStop());
        }
    }

    @Override
    public void wheelsInfo() {
        System.out.println(wheels.wheelsInfo());
    }

    @Override
    public void controSystemCheck() {

        if (controlSyetem.isWorking()) {
            System.out.println(controlSyetem.systemStop());
        } else {
            System.out.println(controlSyetem.systemStart());
        }
    }
}
