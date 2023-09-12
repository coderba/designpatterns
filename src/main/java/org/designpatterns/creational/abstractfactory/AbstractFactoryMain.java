package org.designpatterns.creational.abstractfactory;

import org.designpatterns.creational.abstractfactory.abstractfactory.CarFactory;
import org.designpatterns.creational.abstractfactory.type.CarType;
import org.designpatterns.creational.abstractfactory.type.Location;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        final CarFactory carFactory = new CarFactory(Location.DEFAULT);
        System.out.println(carFactory.build(CarType.MICRO));
        System.out.println(carFactory.build(CarType.LUXURY));
        System.out.println(carFactory.build(CarType.MINI));

        carFactory.setLocation(Location.TR);
        System.out.println(carFactory.build(CarType.MICRO));
        System.out.println(carFactory.build(CarType.LUXURY));
        System.out.println(carFactory.build(CarType.MINI));

        carFactory.setLocation(Location.USA);
        System.out.println(carFactory.build(CarType.MICRO));
        System.out.println(carFactory.build(CarType.LUXURY));
        System.out.println(carFactory.build(CarType.MINI));
    }
}
