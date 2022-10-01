package com.mozahidone.pattern.factory.paymentExample;

public class Client {

    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();
        Payment payment = factory.getFurniture("Bikash");
        System.out.println(payment.getName());

        payment = factory.getFurniture("Nagad");
        System.out.println(payment.getName());
    }
}
