package org.designpatterns.creational.abstractfactory.model;

import org.designpatterns.creational.abstractfactory.type.CarType;
import org.designpatterns.creational.abstractfactory.type.Location;

public class MicroCar extends Car {
    public MicroCar(Location location) {
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Constructing a micro car");
    }
}
