package org.designpatterns.creational.abstractfactory.factory;

import org.designpatterns.creational.abstractfactory.model.Car;
import org.designpatterns.creational.abstractfactory.type.CarType;

public interface Factory {
    public Car build(CarType carType);
}
