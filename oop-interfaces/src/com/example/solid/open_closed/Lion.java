package com.example.solid.open_closed;

public class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    public void legCount() {
        System.out.println("Lion has 4 legs");
    }
}
