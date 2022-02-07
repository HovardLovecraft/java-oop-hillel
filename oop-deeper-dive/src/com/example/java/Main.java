package com.example.java;

import com.example.java.fruits.Olive;
import com.example.java.fruits.model.Kalamata;
import com.example.java.fruits.model.Ligurian;
import com.example.java.tools.IPress;
import com.example.java.tools.model.OlivePress;

/**
 * Create Java program which implements olive press and gets oil from olives.
 * Press should receive an olive or olives and get special amount of oil from olives.
 * Describe each olive to have different characteristics such as name, color and amount of oil.
 * Use all features of OOP in describing classes,  Encapsulation, Inheritance, Polymorphism and Abstraction.
 * Correctly override methods equals, hashCode and toString for Olives.
 * All classes should be divided into correspondent packages.
 */

public class Main {
    public static void main(String[] args) {
        IPress press = new OlivePress();
        int totalOil = press.getOil(new Olive[]{new Kalamata(), new Ligurian(), new Kalamata()});

        System.out.println("You got " + totalOil + " units of oil");
    }
}
