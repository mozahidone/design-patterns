package com.mozahidone.pattern.strategy;

public class PaymentContext {
    private PaymentProcessor paymentProcessor;

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment(Order order) {
        paymentProcessor.processPayment(order);
    }
}