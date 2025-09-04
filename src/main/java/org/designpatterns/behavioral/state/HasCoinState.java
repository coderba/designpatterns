package org.designpatterns.behavioral.state;

public record HasCoinState(VendingMachine machine) implements State {

    @Override
    public void insertCoin() {
        System.out.println("❌ A coin is already inserted. Press the button to get your item.");
    }

    @Override
    public void pressButton() {
        System.out.println("✅ Button pressed. Dispensing item. Transitioning to 'NoCoinState'.");
        machine.setState(machine.getSoldState());
        machine.dispense();
    }

    @Override
    public void dispense() {
        // This is handled in the VendingMachine class to decrement inventory
    }
}
