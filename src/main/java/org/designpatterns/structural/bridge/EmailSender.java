package org.designpatterns.structural.bridge;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending Email message: " + message);
    }
}
