package com.java.Ecommerce.service;

import com.java.Ecommerce.model.Order;

public class UPIPaymentGateway {
    public void authorizeAndHoldUPI(Order o) {
        System.out.println("Contacting UPI Gateway  for Amount " + o.getAmount());
        System.out.println("Authorizing Payment  Gateway");
 //     o.progressOrder("PENDING");

    }
    public void captureUPI(Order o){
        System.out.println("Transferring AAmount from UPI gateway");

    }
}