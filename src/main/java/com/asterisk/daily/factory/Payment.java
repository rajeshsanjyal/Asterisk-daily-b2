package com.asterisk.daily.factory;

import com.asterisk.daily.factory.request.PaymentRequest;

public abstract class Payment {
    protected PaymentRequest paymentRequest;

    public void initializeRequest(PaymentRequest paymentRequest){
        this.paymentRequest=paymentRequest;
    }
    private Boolean validate(){
        if(paymentRequest.getAmount()!=null){
            int valueSign=paymentRequest.getAmount().compareTo(0D);
            if(valueSign==1){
                return true;
            }
            return false;
        }
        return true;
    }
    public abstract  Object pay();
}
