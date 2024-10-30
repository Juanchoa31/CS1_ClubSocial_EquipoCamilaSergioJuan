package com.mycompany.socialc;

class Partner extends Member{
    private static final double MAX_REGULAR_FUNDS = 1000000;
    private static final double MAX_VIP_FUNDS = 5000000;
    private String membershipType;

    public Partner(String id, String name, String membershipType) {
        super(id, name, membershipType.equals("VIP") ? 100000 : 50000);
        this.membershipType = membershipType;
    }

    @Override
    public String getMembershipType() {
        return membershipType;
    }

    public boolean addFunds(double amount) {
        double maxFunds = membershipType.equals("VIP") ? MAX_VIP_FUNDS : MAX_REGULAR_FUNDS;
        if (availableFunds + amount <= maxFunds) {
            availableFunds += amount;
            return true;
        }
        return false;
    }

    public boolean payBill(Bill bill) {
        if (availableFunds >= bill.getAmount()) {
            availableFunds -= bill.getAmount();
            unpaidBills.remove(bill);
            return true;
        }
        return false;
    }

    public boolean registerConsumption(String description, double amount, Guest guest) {
        if ((guest == null && availableFunds >= amount) || (guest != null && availableFunds >= amount)) {
            Bill bill = new Bill(description, amount, this);
            unpaidBills.add(bill);
            if (guest != null) {
                guest.addUnpaidBill(bill);
            }
            return true;
        }
        return false;
    }
}
   