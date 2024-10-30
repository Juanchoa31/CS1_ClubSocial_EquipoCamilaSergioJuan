package com.mycompany.socialc;



class Guest {
    String name;
    private Bill unpaidBill;

    public Guest(String name) {
        this.name = name;
        }

    public boolean hasUnpaidBill() {
        return unpaidBill != null;
        }

    public void addUnpaidBill(Bill bill) {
        this.unpaidBill = bill;
        }
    }
        
