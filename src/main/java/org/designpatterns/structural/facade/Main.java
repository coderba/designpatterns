package org.designpatterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new DVDPlayer(), new Projector(), new Lights());
        homeTheaterFacade.watchMovie("the matrix");
        homeTheaterFacade.endMovie();
    }
}
