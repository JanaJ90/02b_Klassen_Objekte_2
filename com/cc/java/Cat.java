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

// Getter
    public String getName() {
        if (getPermission()) {
            return name;
        } else {
            return "Sorry, no permission!";
        }

        
    }

// Setter- Einrichter
    public void setName(String name) {
        this.name = name;
    }


    public String getFurColor() {
        return furColor;
    }


    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }


    public boolean getPermission( ) {
        // return true;
        return false;
}

}
