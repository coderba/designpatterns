package org.designpatterns.structural.bridge;

// the abstraction
public abstract class Notification {
    public NotificationSender sender;
    public Notification(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void notifyUser(String message);
}
