package com.mycompany.socialc;



class Guest {
    String name;
    private Bill unpaidBill;//almacena factura pte de pago

    //constructor
    public Guest(String name) {
        this.name = name;
        }

    //verifica si tiene factura pte
    public boolean hasUnpaidBill() {
        return unpaidBill != null;//retorna true si hay factura pte
        }

    //asigna factura pte al invitado
    public void addUnpaidBill(Bill bill) {
        this.unpaidBill = bill; //Asigna el objeto Bill proporcionado al unpaidBill.
        }
    }
        
