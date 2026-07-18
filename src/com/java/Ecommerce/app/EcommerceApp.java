package com.java.Ecommerce.app;

import com.java.Ecommerce.model.Order;
import com.java.Ecommerce.service.CheckoutEngine;
import com.java.Ecommerce.service.UPIPaymentGateway;

public class EcommerceApp {
    public static void main(String[] args){
        Order o = new Order("AC-456",9000.60);
        UPIPaymentGateway up = new UPIPaymentGateway();
        CheckoutEngine ce=new CheckoutEngine(up);
        ce.checkout("UPI",o);
    }
}
