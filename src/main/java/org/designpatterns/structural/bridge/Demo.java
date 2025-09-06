package org.designpatterns.structural.bridge;

/*
When to Use Bridge Pattern
The Bridge Pattern is used when you want to decouple an abstraction (high-level concept) from its implementation
(low-level details), so both can evolve independently.

Think of it as:
Abstraction → The “what”
Implementation → The “how”
 */
public class Demo {
    public static void main(String[] args) {
        Notification urgentEmailNotification = new UrgentNotification(new EmailSender());
        Notification normalEmailNotification = new NormalNotification(new EmailSender());
        Notification urgentSlackNotification = new UrgentNotification(new SlackSender());

        urgentSlackNotification.notifyUser("slack notification");
        urgentEmailNotification.notifyUser("email notification");
        normalEmailNotification.notifyUser("email notification");
    }
}
