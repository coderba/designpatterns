package org.designpatterns.behavioral.state;

public class Demo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        System.out.println("--- First transaction ---");
        machine.pressButton(); // Invalid action
        machine.insertCoin(); // Valid action
        machine.pressButton(); // Valid action

        System.out.println("\n--- Second transaction ---");
        machine.insertCoin();
        machine.pressButton();

        System.out.println("\n--- Third transaction (sold out) ---");
        machine.insertCoin(); // This will not work
        machine.pressButton(); // This will also not work

    }
}
