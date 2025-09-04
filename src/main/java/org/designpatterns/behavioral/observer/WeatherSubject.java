package org.designpatterns.behavioral.observer;

// Subject interface
public interface WeatherSubject {
    void attach(WeatherObserver observer);
    void detach(WeatherObserver observer);
    void notifyObservers();
}
