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

    public abstract String getMembershipType();//metodo que devuelve tipo de membresia

    public boolean addAuthorizedGuest(Guest guest) {//metodo para añadir un invitado
        //verifica que invitados sea menor que 10
        if (authorizedGuests.size() < 10) {
            authorizedGuests.add(guest);//añade invitado a la lista
            return true;//añadido exitosamente
        }
        return false;//no se puede, hay mas de 10 usuarios invitados
    }

    //eliminar un invitado
    public boolean removeAuthorizedGuest(Guest guest) {
        //verifica que el invitado no tenga facturas pendientes
        if (!guest.hasUnpaidBill() && authorizedGuests.contains(guest)) {
            authorizedGuests.remove(guest);//elimina invitado de lista guest
            
            return true;//eliminado 
        }
        return false;//tiene bill ptes o no esta en lista
    }
}
    
