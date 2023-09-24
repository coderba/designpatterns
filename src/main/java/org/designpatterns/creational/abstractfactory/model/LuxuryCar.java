package org.designpatterns.creational.abstractfactory.model;

import org.designpatterns.creational.abstractfactory.type.CarType;
import org.designpatterns.creational.abstractfactory.type.Location;

public class LuxuryCar extends Car {
    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Constructing a luxury car");
    }
}
