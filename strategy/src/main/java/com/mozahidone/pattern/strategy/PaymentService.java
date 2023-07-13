package com.mozahidone.pattern.strategy;

public class PaymentService {
    private PaymentContext paymentContext;

    public void setPaymentContext(PaymentContext paymentContext) {
        this.paymentContext = paymentContext;
    }

    public void processOrderPayment(Order order) {
        paymentContext.processPayment(order);
    }
}
