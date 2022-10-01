package com.mozahidone.pattern.factory.paymentExample;

public class PaymentFactory {

    public Payment getFurniture(String type) {
        if(type == null)
            return null;
        if(type.equalsIgnoreCase("Bikash"))
            return new Bikash();
        if(type.equalsIgnoreCase("Nagad"))
            return new Nagad();
        return null;
    }
}
