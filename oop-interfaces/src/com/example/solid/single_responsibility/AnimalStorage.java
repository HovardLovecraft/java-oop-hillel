package com.example.solid.single_responsibility;

public class AnimalStorage {

    public Animal getAnimal(){
        return new Animal("");
    }

    public void saveAnimal(Animal a){
        System.out.println("Animal is saved");
    }
}
