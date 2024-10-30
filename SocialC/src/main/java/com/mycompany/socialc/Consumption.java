package com.mycompany.socialc;


public class Consumption {
    private String description;
    private double amount;

    //constructor
    public Consumption(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    //retorna monto del consumo
    public double getAmount() {
        return amount;
    }
}
    

