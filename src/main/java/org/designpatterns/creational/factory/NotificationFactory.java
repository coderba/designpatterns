package org.designpatterns.creational.factory;

public class NotificationFactory {
    public Notification createNotification(NotificationType notificationType) {
        if (notificationType == null) {
            throw new IllegalArgumentException("NotificationType cannot be null");
        }
        
        return switch (notificationType) {
            case SMS -> new SmsNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
            default -> throw new IllegalArgumentException("Unsupported notification type: " + notificationType);
        };
    }
}
