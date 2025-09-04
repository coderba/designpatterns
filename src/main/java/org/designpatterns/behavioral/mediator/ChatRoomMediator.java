package org.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomMediator implements ChatRoom {
    private final List<User> users;

    public ChatRoomMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        // The mediator's job is to route the message.
        // It knows about all users and decides who gets the message.
        for (User u : users) {
            // Do not send the message back to the sender
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }
}
