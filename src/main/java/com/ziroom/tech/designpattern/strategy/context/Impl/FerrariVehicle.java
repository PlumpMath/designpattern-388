package com.ziroom.tech.designpattern.strategy.context.Impl;

import com.ziroom.tech.designpattern.strategy.context.VehicleContext;
import com.ziroom.tech.designpattern.strategy.deligation.ControlSyetem;
import com.ziroom.tech.designpattern.strategy.deligation.Engine;
import com.ziroom.tech.designpattern.strategy.deligation.Wheels;

/**
 * Created by LD.
 *
 * @date 29/12/2016.
 */
public class FerrariVehicle extends VehicleContext {


    FerrariVehicle(Engine engine, ControlSyetem controlSyetem, Wheels wheels) {
        engine = engine;
        controlSyetem = controlSyetem;
        wheels = wheels;
    }

    @Override
    public void engineStart(Engine engine) {
        if (engine.isWorking()) {
            System.out.println(engine.engineStart());
        } else {
            System.out.println(engine.engineStop());
        }
    }

    @Override
    public void wheelsInfo(Wheels wheels) {

        System.out.println(wheels.wheelsInfo());

    }

    @Override
    public void controSystemCheck(ControlSyetem controlSyetem) {

        if (controlSyetem.isWorking()) {
            System.out.println(controlSyetem.systemStop());
        } else {
            System.out.println(controlSyetem.systemStart());
        }

    }
}
