package org.designpatterns.behavioral.state;

// Concrete State 1
public record NoCoinState(VendingMachine machine) implements State {

    @Override
    public void insertCoin() {
        System.out.println("✅ Coin inserted. Transitioning to 'HasCoinState'.");
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("❌ Please insert a coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("❌ Cannot dispense. Not enough money.");
    }
}