package com.mycompany.socialc;

class Bill {
    String description;
    private double amount;
    private Partner partner;

    //constructor
    public Bill(String description, double amount, Partner partner) {
        this.description = description;
        this.amount = amount;
        this.partner = partner;
    }

    //obtiene el monto de la factura
    public double getAmount() {
        return amount;
    }
}
    