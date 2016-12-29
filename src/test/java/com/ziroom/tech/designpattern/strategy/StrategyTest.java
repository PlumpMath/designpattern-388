package com.ziroom.tech.designpattern.strategy;

import com.ziroom.tech.designpattern.strategy.context.Impl.FerrariVehicle;
import com.ziroom.tech.designpattern.strategy.context.Impl.UniversalVehicle;
import com.ziroom.tech.designpattern.strategy.context.Impl.VolkswagenVehicle;
import com.ziroom.tech.designpattern.strategy.context.VehicleContext;
import com.ziroom.tech.designpattern.strategy.deligation.ControlSyetem;
import com.ziroom.tech.designpattern.strategy.deligation.Engine;
import com.ziroom.tech.designpattern.strategy.deligation.Impl.FerrariEngine;
import com.ziroom.tech.designpattern.strategy.deligation.Impl.FerrariWheels;
import com.ziroom.tech.designpattern.strategy.deligation.Impl.VolkswagenControlSystem;
import com.ziroom.tech.designpattern.strategy.deligation.Wheels;
import org.junit.Test;

/**
 * Created by homelink on 2016/12/29.
 */
public class StrategyTest {

    @Test
    public void strategyTest () {

        VehicleContext vehicleContext = new VolkswagenVehicle();
        vehicleContext.controSystemCheck();
        vehicleContext.engineStart();
        vehicleContext.wheelsInfo();

        System.out.println();

        vehicleContext = new FerrariVehicle();
        vehicleContext.controSystemCheck();
        vehicleContext.engineStart();
        vehicleContext.wheelsInfo();

        System.out.println();

        Engine engine = new FerrariEngine();
        Wheels wheels = new FerrariWheels();
        ControlSyetem controlSyetem = new VolkswagenControlSystem();
        vehicleContext = new UniversalVehicle(engine, controlSyetem, wheels);
        vehicleContext.controSystemCheck();
        vehicleContext.engineStart();
        vehicleContext.wheelsInfo();


    }
}
