package org.designpatterns.structural.facade;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier ON");
    }

    public void off() {
        System.out.println("Amplifier OFF");
    }

    public void setVolume(int level) {
        System.out.println("Amplifier volume set to " + level);
    }
}
