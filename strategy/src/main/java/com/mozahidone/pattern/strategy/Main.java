package com.mozahidone.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentProcessor(new Bikash());
        paymentService.setPaymentContext(paymentContext);
        paymentService.processOrderPayment(new Order());
    }
}
