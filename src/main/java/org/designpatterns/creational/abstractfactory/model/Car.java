package org.designpatterns.creational.abstractfactory.model;

import org.designpatterns.creational.abstractfactory.type.CarType;
import org.designpatterns.creational.abstractfactory.type.Location;

public abstract class Car {
    private CarType carType;
    private Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    public abstract void construct();

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}
