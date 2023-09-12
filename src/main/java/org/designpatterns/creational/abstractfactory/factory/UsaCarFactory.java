package org.designpatterns.creational.abstractfactory.factory;

import org.designpatterns.creational.abstractfactory.model.Car;
import org.designpatterns.creational.abstractfactory.model.LuxuryCar;
import org.designpatterns.creational.abstractfactory.model.MicroCar;
import org.designpatterns.creational.abstractfactory.model.MiniCar;
import org.designpatterns.creational.abstractfactory.type.CarType;
import org.designpatterns.creational.abstractfactory.type.Location;

public class UsaCarFactory implements Factory{
    @Override
    public Car build(CarType carType) {
        return switch (carType){
            case MICRO -> new MicroCar(Location.USA);
            case MINI -> new MiniCar(Location.USA);
            case LUXURY -> new LuxuryCar(Location.USA);
        };
    }
}
