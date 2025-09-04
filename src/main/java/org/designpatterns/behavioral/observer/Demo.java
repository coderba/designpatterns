package org.designpatterns.behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver phoneDisplay = new PhoneDisplay();
        WeatherObserver tvDisplay = new TvDisplay();
        weatherStation.attach(phoneDisplay);
        weatherStation.attach(tvDisplay);

        weatherStation.setTemperature(30);
        System.out.println("\n----------------------------------\n");
        weatherStation.setTemperature(45);
        System.out.println("\n----------------------------------\n");
        weatherStation.detach(phoneDisplay);
        weatherStation.detach(tvDisplay);
    }
}
