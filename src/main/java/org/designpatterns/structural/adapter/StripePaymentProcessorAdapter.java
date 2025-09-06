package org.designpatterns.structural.adapter;

public record StripePaymentProcessorAdapter(StripePayment stripePayment) implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        int cents = (int) (amount * 100); // convert dollars to cents
        stripePayment.makePayment(cents);
    }
}
