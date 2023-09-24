package org.designpatterns.creational.abstractfactory.model;

import org.designpatterns.creational.abstractfactory.type.CarType;
import org.designpatterns.creational.abstractfactory.type.Location;

public class MiniCar extends Car {
    public MiniCar(Location location) {
        super(CarType.MINI, location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Constructing a mini car");
    }
}
