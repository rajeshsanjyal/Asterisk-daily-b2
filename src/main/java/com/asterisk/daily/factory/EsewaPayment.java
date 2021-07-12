package com.asterisk.daily.factory;


public class EsewaPayment extends Payment{

    @Override
    public Object pay() {
        //esewa hits
        return "Esewa wallet payment for amount: "
                +paymentRequest.getAmount()+"for the product : "
                +paymentRequest.getProduct();
    }
}
