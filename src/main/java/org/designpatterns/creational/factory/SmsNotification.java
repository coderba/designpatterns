package org.designpatterns.creational.factory;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending sms notification");
    }
}
