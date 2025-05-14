package org.example;

public class SecondDaughter extends Character implements Travesura {

    public SecondDaughter() {
        super("Naiara", "la segunda hija de Alex", "dibujar", 7);
    }

    @Override
    public String hacerTravesura() {
        return name + " Se comé todo el helado de chocolate.";
    }
}