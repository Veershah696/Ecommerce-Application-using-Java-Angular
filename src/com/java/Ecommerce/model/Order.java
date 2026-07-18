package com.java.Ecommerce.model;

public class Order {
    private final String sjy;
    private final double amount;
    private String status;

    public Order(String sjy, double amount){
        this.sjy = sjy;
        this.amount = amount;
        this.status = "NEW";
    }

    public void processPayment(String status){
        if(this.status.equalsIgnoreCase("NEW") && status.equalsIgnoreCase("Pending"))
            this.status="Pending";
        else if(this.status.equalsIgnoreCase("Pending") && status.equalsIgnoreCase("PAID"))
            this.status="PAID";

    }

    public double getAmount(){
        return amount;
    }
    public String getSjy(){
        return sjy;
    }
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }

}