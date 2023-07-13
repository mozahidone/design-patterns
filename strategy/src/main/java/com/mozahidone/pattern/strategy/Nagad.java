package com.mozahidone.pattern.strategy;

public class Nagad implements PaymentProcessor {

    @Override
    public void processPayment(Order order) {
        // Implement payment processing logic using Nagad
        System.out.println("Payment using Nagad");
    }
}