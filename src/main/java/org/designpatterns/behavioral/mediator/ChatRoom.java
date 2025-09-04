package org.designpatterns.behavioral.mediator;

// Mediator interface
public interface ChatRoom {
    void sendMessage(String message, User user);
    void addUser(User user);
}
