package com.example.solid.open_closed;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("This animal makes some sound");
    }

    public void legCount() {
        System.out.println("leg count method");
    }

}
