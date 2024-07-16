package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung  --> Erzeugen eines Objektes
        // System.out.println(new Cat());

        // cat --> Referenzvariable
        // Cat --> Referenztyp(Klasse)
        // Custom - Konstraktor
        Cat cat = new Cat("Grizabella", "white",  29);
        output("Blick von aussen: " + cat);
        output("Blick von innen: " + cat.getInstanceVariable());

        // Werte setzen
       

        // Werte ausgeben
        output(cat.getName());
        output(cat.getFurColor());
        output(Integer.toString(cat.getAge())); // Explizite Typumwandlung

        // cat.furColor = "grey";
        // output(cat.furColor);



        System.out.println("----------------------------");

        Cat cat2 = new Cat(null, null, 0);
        output("Blick von aussen: " + cat2);
        output("Blick von innen: " + cat2.getInstanceVariable());

        // Werte setzen
        // cat2.name = "Alonzo";
        // cat2.furColor = "grey";
        // cat2.age = 35;

        // Werte ausgeben
        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge())); // Explizite Typumwandlung

        cat2.setAge(36);
        output(Integer.toString(cat2.getAge())); // Explizite Typumwandlung))
    }

      // Statische Methode, die in der Klasse ausgeführt wird ...
    public static void output(String outputStr){
        System.out.println(outputStr);
    }
   
}

