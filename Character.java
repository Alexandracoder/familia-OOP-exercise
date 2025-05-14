package org.example;

public abstract class Character {
    protected String name;
    private String hobbies;
    private String rol;
    private int age;

    public Character(String name, String rol, String hobbies, int age) {
        this.name = name;
        this.rol = rol;
        this.hobbies = hobbies;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    protected String presentarse() {
        return "Hola, soy " + name + ", tengo " + age + " años, soy " + rol + " y me gusta " + hobbies + ".";
    }

    protected String cumplirAños() {
        this.age += 1;
        return "Soy " + name + " y acabo de cumplir " + age + " años.";
    }

    protected String dibujar() {
        return name + " está dibujando con mucha imaginación.";
    }

    protected String cantar() {
        return name + " canta su canción favorita.";
    }
}


