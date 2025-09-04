package org.designpatterns.behavioral.state;

public record SoldOutState(VendingMachine machine) implements State {

    @Override
    public void insertCoin() {
        System.out.println("❌ The vending machine is sold out.");
    }

    @Override
    public void pressButton() {
        System.out.println("❌ The vending machine is sold out.");
    }

    @Override
    public void dispense() {
        System.out.println("❌ Item is not available.");
    }
}
