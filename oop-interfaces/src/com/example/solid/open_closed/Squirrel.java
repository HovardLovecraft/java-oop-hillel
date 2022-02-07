package com.example.solid.open_closed;

public class Squirrel extends Animal {
    public Squirrel(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("squeek");
    }

    public void legCount() {
        System.out.println("Squirrel has 4 legs");
    }
}
