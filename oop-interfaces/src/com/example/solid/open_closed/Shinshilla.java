package com.example.solid.open_closed;

public class Shinshilla extends Animal{
    public Shinshilla(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("azazaz");
    }

    @Override
    public void legCount() {
        System.out.println("Shinshill has 4 legs");
    }
}
