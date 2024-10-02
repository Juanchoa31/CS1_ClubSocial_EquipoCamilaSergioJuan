
package com.mycompany.socialclub.Logic;

/**
 *
 * @author Camila
 */
public class GuestClass {
    private String name;
    private int document;
    private int number;

    public GuestClass(String name, int document, int number) {
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

    
    public int getDocument() {
        return document;
    }

   
    public void setDocument(int document) {
        this.document = document;
    }

    
    public int getNumber() {
        return number;
    }

    
    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
