package org.designpatterns.structural.bridge;

public class UrgentNotification extends Notification {
    public UrgentNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.send("URGENT: " + message);
    }
}
