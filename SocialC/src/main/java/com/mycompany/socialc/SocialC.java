package com.mycompany.socialc;
import com.mycompany.socialc.*;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import ui.forms.HomeViewFormBill;
import ui.forms.dialogs.ShowDialogBill;

public class SocialC {
    private static Club club = new Club();
    
    public static void main(String[] args) {
        
        while (true) {
        String menu = "1. Register a member\n" +
                      "2. Register a guest\n" +
                      "3. Pay a bill\n" +
                      "4. Register a consumption\n" +
                      "5. Increase funds\n" +
                      "6. Remove member\n" +
                      "7. List members\n" +
                      "8. Exit";
        String choice = JOptionPane.showInputDialog(menu);
        if (choice == null || choice.equals("8")) break;

        switch (choice) {
            case "1" -> registerMember();
            case "2" -> registerGuest();
            case "3" -> payBill();
            case "4" -> registerConsumption();
            case "5" -> increaseFunds();
            case "6" -> removeMember();
            case "7" -> listMembers();
            default -> JOptionPane.showMessageDialog(null, "Invalid option");
        }
    }
}

    private static void listMembers() {
        String members = club.listMembers();
        JOptionPane.showMessageDialog(null, members);
    }

    private static void registerMember() {
        String id = JOptionPane.showInputDialog("Enter ID:");
        String name = JOptionPane.showInputDialog("Enter name:");
        String type = JOptionPane.showInputDialog("Enter type (VIP/Regular):");
        Partner partner = new Partner(id, name, type);
        if (club.addMember(partner)) {
            JOptionPane.showMessageDialog(null, "Member added");
        } else {
            JOptionPane.showMessageDialog(null, "Error adding member");
        }
    }

    private static void registerGuest() {
        String partnerId = JOptionPane.showInputDialog("Enter member ID:");
        Partner partner = club.members.get(partnerId);

        if (partner == null) {
            JOptionPane.showMessageDialog(null, "Member not found.");
            return;
        }

        String guestName = JOptionPane.showInputDialog("Enter guest name:");
        Guest guest = new Guest(guestName);
        
        if (partner.addAuthorizedGuest(guest)) {
            JOptionPane.showMessageDialog(null, "Guest added.");
        } else {
            JOptionPane.showMessageDialog(null, "Could not add guest.");
        }
    }

    private static void payBill() {
        HomeViewFormBill menuBill = new HomeViewFormBill();
        menuBill.setVisible(true);
        menuBill.setLocationRelativeTo(null);
    }   

    private static void registerConsumption() {
        String partnerId = JOptionPane.showInputDialog("Enter member ID:");
        Partner partner = club.members.get(partnerId);

        if (partner == null) {
            JOptionPane.showMessageDialog(null, "Member not found.");
            return;
        }

        String guestName = JOptionPane.showInputDialog("Enter guest name (leave blank if it's the member):");
        Guest guest = null;

        if (!guestName.isEmpty()) {
            for (Guest g : partner.authorizedGuests) {
                if (g.name.equals(guestName)) {
                    guest = g;
                    break;
                }
            }
            if (guest == null) {
                JOptionPane.showMessageDialog(null, "Guest not found.");
                return;
            }
        }

        String description = JOptionPane.showInputDialog("Enter consumption description:");
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount of consumption:"));

        if (partner.registerConsumption(description, amount, guest)) {
            JOptionPane.showMessageDialog(null, "Consumption registered.");
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient funds.");
        }
    }

    private static void increaseFunds() {
        String partnerId = JOptionPane.showInputDialog("Enter member ID:");
        Partner partner = club.members.get(partnerId);

        if (partner == null) {
            JOptionPane.showMessageDialog(null, "Member not found.");
            return;
        }

        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to add:"));
        
        if (partner.addFunds(amount)) {
            JOptionPane.showMessageDialog(null, "Funds increased successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Error increasing funds. Please check the limit.");
        }
    }

    private static void removeMember() {
        String partnerId = JOptionPane.showInputDialog("Enter member ID:");
        if (club.removeMember(partnerId)) {
            JOptionPane.showMessageDialog(null, "Member removed successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Error removing member.");
        }
    }
}
        
   