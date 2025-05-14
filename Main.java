package org.example;

public class Main {
    public static void main(String[] args) {
        FirstDaughter firstDaughter = new FirstDaughter();
        SecondDaughter secondDaughter = new SecondDaughter();

        Pet pet = new Pet();

        System.out.println(firstDaughter.presentarse());
        System.out.println(firstDaughter.hacerTravesura());
        System.out.println(firstDaughter.cumplirAños());
        System.out.println(firstDaughter.dibujar());
        System.out.println(firstDaughter.cantar());

        System.out.println(secondDaughter.presentarse());
        System.out.println(secondDaughter.hacerTravesura());
        System.out.println(secondDaughter.cumplirAños());
        System.out.println(secondDaughter.dibujar());
        System.out.println(secondDaughter.cantar());

        System.out.println(pet.presentarse());
    }
}