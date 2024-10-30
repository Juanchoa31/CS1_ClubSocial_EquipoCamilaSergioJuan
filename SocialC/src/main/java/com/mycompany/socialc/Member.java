package com.mycompany.socialc;

import java.util.ArrayList;

abstract class Member {
    protected String id;
    protected String name;
    protected double availableFunds;
    protected ArrayList<Bill> unpaidBills;
    protected ArrayList<Guest> authorizedGuests;

    public Member(String id, String name, double availableFunds) {
        this.id = id;
        this.name = name;
        this.availableFunds = availableFunds;
        this.unpaidBills = new ArrayList<>();
        this.authorizedGuests = new ArrayList<>();
    }

    public abstract String getMembershipType();

    public boolean addAuthorizedGuest(Guest guest) {
        if (authorizedGuests.size() < 10) {
            authorizedGuests.add(guest);
            return true;
        }
        return false;
    }

    public boolean removeAuthorizedGuest(Guest guest) {
        if (!guest.hasUnpaidBill() && authorizedGuests.contains(guest)) {
            authorizedGuests.remove(guest);
            return true;
        }
        return false;
    }
}
    
