package org.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class WeatherStation implements WeatherSubject {
    List<WeatherObserver> weatherObservers = new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Weather Station: New temperature reading: " + this.temperature + "°F");
        notifyObservers();
    }

    @Override
    public void attach(WeatherObserver observer) {
        weatherObservers.add(observer);
    }

    @Override
    public void detach(WeatherObserver observer) {
        weatherObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        weatherObservers.forEach(weatherObserver -> weatherObserver.update(this.temperature));
    }
}
