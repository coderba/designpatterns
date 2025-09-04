package org.designpatterns.behavioral.observer;

public class TvDisplay implements WeatherObserver {
    @Override
    public void update(int temperature) {
        System.out.println("📺 TV Display: A new weather alert! The temperature is " + temperature + "°F.");
    }
}
