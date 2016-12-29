package com.ziroom.tech.designpattern.strategy.context.Impl;

import com.ziroom.tech.designpattern.strategy.context.VehicleContext;
import com.ziroom.tech.designpattern.strategy.deligation.ControlSyetem;
import com.ziroom.tech.designpattern.strategy.deligation.Engine;
import com.ziroom.tech.designpattern.strategy.deligation.Impl.FerrariControlSystem;
import com.ziroom.tech.designpattern.strategy.deligation.Impl.FerrariEngine;
import com.ziroom.tech.designpattern.strategy.deligation.Impl.FerrariWheels;
import com.ziroom.tech.designpattern.strategy.deligation.Wheels;

/**
 * Created by LD.
 *
 * @date 29/12/2016.
 */
public class FerrariVehicle extends VehicleContext {

    public FerrariVehicle() {
        super();
        engine = new FerrariEngine();
        controlSyetem = new FerrariControlSystem();
        wheels = new FerrariWheels();
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
