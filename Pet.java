package org.example;

public class Pet {
    public String name;
    public int age;
    public String barks;

    public Pet () {
        this.name = "Wisha";
        this.age = 14;
        this.barks = "ladrar";
    }
    public String presentarse() {
       return  "Hola, soy " + name + " la perra,  y me encantan los huesos y " + barks + " en todas partes .";
    }
}

