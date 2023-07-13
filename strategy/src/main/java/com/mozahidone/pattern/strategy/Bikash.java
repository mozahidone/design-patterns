package com.mozahidone.pattern.strategy;

public class Bikash implements PaymentProcessor {

    @Override
    public void processPayment(Order order) {
        // Implement payment processing logic using Payment1
        System.out.println("Payment using Bikash");
    }
}
