package org.designpatterns.structural.adapter;

public class PaypalPaymentProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
