package com.java.Ecommerce.service;

import com.java.Ecommerce.model.Order;

public class CheckoutEngine {
    UPIPaymentGateway up;

    public CheckoutEngine(UPIPaymentGateway up){
        this.up=up;
    }
    public void checkout(String paymentType, Order o){
        if(paymentType.equalsIgnoreCase("UPI")) {
            up.authorizeAndHoldUPI(o);
            o.processPayment("Pending");
            up.captureUPI(o);
            o.processPayment("PAID");
        }
    }
}