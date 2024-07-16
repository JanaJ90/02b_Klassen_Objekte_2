package com.cc.java;

public class Cat {
  
    // Felder / fields / attributes
    private String name; // pass by reference
    private String furColor;
    private int age;  // pass by value
    
    // Konstruktor(keinen Rükgabetyp)
    public Cat(String name, String furColor, int age) {
        // this-->verweist auf das Objekt//
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }


    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}
