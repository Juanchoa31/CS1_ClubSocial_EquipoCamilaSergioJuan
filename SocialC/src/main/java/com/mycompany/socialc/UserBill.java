package com.mycompany.socialc;

public class UserBill {
    private String idMember;
    private String nameMember;
    private String costDes;
    private String amountPay;

    public UserBill() {
    }

    public UserBill(String idMember, String nameMember, String costDes, String amountPay) {
        this.idMember = idMember;
        this.nameMember = nameMember;
        this.costDes = costDes;
        this.amountPay = amountPay;
    }

    /**
     * @return the alias
     */
    public String getIdMember() {
        return idMember;
    }

    /**
     * @param alias the alias to set
     */
    public void setIdMember(String alias) {
        this.idMember = idMember;
    }

    /**
     * @return the nameMember
     */
    public String getNameMember() {
        return nameMember;
    }

    /**
     * @param nameMember the nameMember to set
     */
    public void setNameMember(String nameMember) {
        this.nameMember = nameMember;
    }
    
    /**
     * @return the name
     */
    public String getCostDes() {
        return costDes;
    }

    /**
     * @param name the name to set
     */
    public void setCostDes(String name) {
        this.costDes = costDes;
    }

    /**
     * @return the email
     */
    public String getAmountPay() {
        return amountPay;
    }

    /**
     * @param email the email to set
     */
    public void setAmountPay(String email) {
        this.amountPay = amountPay;
    }
    
    public String getInfo(){
        return this.getIdMember()+ " - " + this.getNameMember()+ " - " + this.getCostDes()+ " - " + this.getAmountPay();
    }
}
