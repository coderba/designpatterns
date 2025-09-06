package org.designpatterns.structural.adapter;

// Imagine this comes from an external SDK
public class StripePayment {
    public void makePayment(int cents) {
        System.out.println("Processing Stripe payment of $" + (cents / 100.0));
    }
}
