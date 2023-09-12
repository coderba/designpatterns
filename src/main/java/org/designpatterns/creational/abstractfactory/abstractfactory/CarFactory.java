package org.designpatterns.creational.abstractfactory.abstractfactory;

import org.designpatterns.creational.abstractfactory.factory.DefaultCarFactory;
import org.designpatterns.creational.abstractfactory.factory.Factory;
import org.designpatterns.creational.abstractfactory.factory.TrCarFactory;
import org.designpatterns.creational.abstractfactory.factory.UsaCarFactory;
import org.designpatterns.creational.abstractfactory.model.Car;
import org.designpatterns.creational.abstractfactory.type.CarType;
import org.designpatterns.creational.abstractfactory.type.Location;

public class CarFactory implements Factory {
    private Location location;

    private CarFactory() {
    }

    public CarFactory(Location location) {
        this.location = location;
    }

    @Override
    public Car build(CarType carType) {
        return switch (getLocation()) {
            case DEFAULT -> new DefaultCarFactory().build(carType);
            case TR -> new TrCarFactory().build(carType);
            case USA -> new UsaCarFactory().build(carType);
        };
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
