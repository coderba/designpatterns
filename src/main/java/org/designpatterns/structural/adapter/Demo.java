package org.designpatterns.structural.adapter;

public class Demo {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PaypalPaymentProcessor();
        paypalProcessor.pay(5000);

        PaymentProcessor stripePaymentProcessor = new StripePaymentProcessorAdapter(new StripePayment());
        stripePaymentProcessor.pay(5000);
    }
}
