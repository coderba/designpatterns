package org.designpatterns.creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        final NotificationFactory notificationFactory = new NotificationFactory();
        final Notification smsNotification = notificationFactory.createNotification(NotificationType.SMS);
        smsNotification.notifyUser();

        final Notification emailNotification = notificationFactory.createNotification(NotificationType.EMAIL);
        emailNotification.notifyUser();

        final Notification pushNotification = notificationFactory.createNotification(NotificationType.PUSH);
        pushNotification.notifyUser();
    }
}
