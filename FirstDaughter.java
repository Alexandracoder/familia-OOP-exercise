package org.example;
public class FirstDaughter extends Character implements Travesura {

    public FirstDaughter() {
        super("Soraya", "la primera hija de Alex", "cantar", 10);
    }

    @Override
    public String hacerTravesura() {
        return name + " se ha puesto el maquillaje de mamá.";
    }

    @Override
    public String dibujar() {
        return name + " está dibujando con colores brillantes.";
    }

    @Override
    public String cantar() {
        return name + " está cantando la canción favorita de mamá.";
    }
}

