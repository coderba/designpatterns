package org.designpatterns.behavioral.observer;

public class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(int temperature) {
        System.out.println("📱 Phone Display: The temperature is now " + temperature + "°F.");
    }
}
