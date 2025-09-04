package org.designpatterns.behavioral.mediator;

// Colleague class
public abstract class User {
    protected ChatRoom mediator;
    protected String name;

    public User(ChatRoom mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
