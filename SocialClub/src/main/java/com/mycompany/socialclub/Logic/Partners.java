package com.mycompany.socialclub.Logic;

public class Partners {

    public static int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String documentType;
    private String document;
    private String name;
    private String subscriptionType;
    private double initialAmount;
    private double fundsLimit;
    private double initialConsumption;
    private int AuthorizePerson;

    public Partners(String documentType, String document, String name, String subscriptionType, double initialAmount, double fundsLimit, double initialConsumption, int AuthorizePerson) {
        this.documentType = documentType;
        this.document = document;
        this.name = name;
        this.subscriptionType = subscriptionType;
        this.initialAmount = initialAmount;
        this.fundsLimit = fundsLimit;
        this.initialConsumption = initialConsumption;
        this.AuthorizePerson = AuthorizePerson;
    }

    
   
    public String getDocumentType() {
        return documentType;
    }

    
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    
    public String getDocument() {
        return document;
    }

    
    public void setDocument(String document) {
        this.document = document;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getSubscriptionType() {
        return subscriptionType;
    }

    
    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

   
    public double getInitialAmount() {
        return initialAmount;
    }

    
    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    
    public double getFundsLimit() {
        return fundsLimit;
    }

    
    public void setFundsLimit(double fundsLimit) {
        this.fundsLimit = fundsLimit;
    }

    
    public double getInitialConsumption() {
        return initialConsumption;
    }

   
    public void setInitialConsumption(double initialConsumption) {
        this.initialConsumption = initialConsumption;
    }

    public int getAuthorizePerson() {
        return AuthorizePerson;
    }

    
    
    public void setAuthorizePerson(int AuthorizePerson) {
        this.AuthorizePerson = AuthorizePerson;
    }
    
}
