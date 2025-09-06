package org.designpatterns.structural.bridge;

public class NormalNotification extends Notification {
    public NormalNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.send("NORMAL: " + message);
    }
}
