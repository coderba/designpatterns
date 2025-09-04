package org.designpatterns.behavioral.mediator;

public class ChatRoomUser extends User {
    public ChatRoomUser(ChatRoom mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " receives: " + message);
    }
}
