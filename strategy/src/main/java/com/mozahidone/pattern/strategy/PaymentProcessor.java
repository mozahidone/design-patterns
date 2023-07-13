package com.mozahidone.pattern.strategy;

public interface PaymentProcessor {
    void processPayment(Order order);
}
