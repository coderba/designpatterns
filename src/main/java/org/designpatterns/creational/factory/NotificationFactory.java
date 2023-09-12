package org.designpatterns.creational.factory;

public class NotificationFactory {
    public Notification createNotification(NotificationType notificationType){
        return switch (notificationType) {
            case SMS -> new SmsNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
        };
    }
}
