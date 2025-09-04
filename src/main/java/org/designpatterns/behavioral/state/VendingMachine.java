package org.designpatterns.behavioral.state;

// Context
public class VendingMachine {
    private final State noCoinState;
    private final State hasCoinState;
    private final State soldOutState;

    private State currentState;
    private int itemCount = 2; // Initial stock

    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldOutState = new SoldOutState(this);

        // Set initial state
        currentState = noCoinState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void pressButton() {
        currentState.pressButton();
    }

    public void dispense() {
        // Vending machine's logic to dispense an item and change state
        if (itemCount > 0) {
            itemCount--;
            System.out.println("Dispensing item. Items remaining: " + itemCount);
            if (itemCount == 0) {
                setState(soldOutState);
            } else {
                setState(noCoinState);
            }
        } else {
            System.out.println("❌ No items to dispense.");
        }
    }

    // Getters for the states
    public State getNoCoinState() { return noCoinState; }
    public State getHasCoinState() { return hasCoinState; }
    public State getSoldState() { return soldOutState; }
}