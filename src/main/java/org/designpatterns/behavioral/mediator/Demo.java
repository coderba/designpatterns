package org.designpatterns.behavioral.mediator;

public class Demo {
    public static void main(String[] args) {
        ChatRoomMediator mediator = new ChatRoomMediator();
        User user1 = new ChatRoomUser(mediator,"user1");
        User user2 = new ChatRoomUser(mediator,"user2");
        User user3 = new ChatRoomUser(mediator,"user3");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("hello");
        System.out.println("----------");
        user2.sendMessage("world");
        System.out.println("----------");
        user3.sendMessage("hello again");
    }
}
