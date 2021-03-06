package com.ziroom.tech.designpattern.strategy.context.Impl;

import com.ziroom.tech.designpattern.strategy.context.*;
import com.ziroom.tech.designpattern.strategy.deligation.ControlSyetem;
import com.ziroom.tech.designpattern.strategy.deligation.Engine;
import com.ziroom.tech.designpattern.strategy.deligation.Impl.VolkswagenControlSystem;
import com.ziroom.tech.designpattern.strategy.deligation.Impl.VolkswagenEngine;
import com.ziroom.tech.designpattern.strategy.deligation.Impl.VolkswagenWheels;
import com.ziroom.tech.designpattern.strategy.deligation.Wheels;

/**
 * Created by LD.
 *
 * @date 29/12/2016.
 */
public class VolkswagenVehicle extends VehicleContext {

    public VolkswagenVehicle() {
        engine = new VolkswagenEngine();
        controlSyetem = new VolkswagenControlSystem();
        wheels = new VolkswagenWheels();
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

