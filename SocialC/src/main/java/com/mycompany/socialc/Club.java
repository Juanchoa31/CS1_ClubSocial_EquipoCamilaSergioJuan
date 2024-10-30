package com.mycompany.socialc;

import java.util.HashMap;


class Club {
    public HashMap<String, Partner> members;

    public Club() {
        members = new HashMap<>();
    }

    public boolean addMember(Partner partner) {
        if (members.size() < 35 && !members.containsKey(partner.id)) {
            members.put(partner.id, partner);
            return true;
        }
        return false;
    }

    public boolean removeMember(String id) {
        Partner partner = members.get(id);
        if (partner == null) {
            return false; 
        }
        if (partner.getMembershipType().equals("VIP")) {
            return false; 
        }
        if (!partner.unpaidBills.isEmpty()) {
            return false; 
        }
        if (partner.authorizedGuests.size() > 1) {
            return false; // 
        }
        members.remove(id);
        return true;
    }
    public String listMembers() {
        StringBuilder memberList = new StringBuilder("List of Members:\n");
        for (Partner member : members.values()) {
            memberList.append("ID: ").append(member.id)
                      .append(", Name: ").append(member.name)
                      .append(", Type: ").append(member.getMembershipType())
                      .append(", Available Funds: $").append(member.availableFunds)
                      .append("\n");
        }
    return memberList.toString();
    }
}
    