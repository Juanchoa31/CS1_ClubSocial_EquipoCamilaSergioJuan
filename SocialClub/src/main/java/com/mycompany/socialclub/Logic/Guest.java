package com.mycompany.socialclub.Logic;

public class Guest {
    private String name;
    private String document;
    private int number;

    public Guest(String name, String document, int number) {
        this.name = name;
        this.document = document;
        this.number = number;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getDocument() {
        return document;
    }

   
    public void setDocument(String document) {
        this.document = document;
    }

    
    public int getNumber() {
        return number;
    }

    
    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
