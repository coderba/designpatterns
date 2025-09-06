package org.designpatterns.structural.bridge;

public class SlackSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}
