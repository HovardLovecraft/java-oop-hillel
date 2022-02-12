package com.example.java;

import com.example.java.characteristics.OliveColor;
import com.example.java.characteristics.OliveName;
import com.example.java.fruits.Olive;
import com.example.java.fruits.model.Alfafara;
import com.example.java.fruits.model.Kalamata;
import com.example.java.fruits.model.Ligurian;
import com.example.java.fruits.model.SomeNewOlive;
import com.example.java.tools.IPress;
import com.example.java.tools.OliveOilComparator;
import com.example.java.tools.OlivePicker;
import com.example.java.tools.OliveSorter;
import com.example.java.tools.model.OlivePress;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
        OliveOilComparator oliveOilComparator = new OliveOilComparator();
        OlivePicker picker = new OlivePicker();
        int totalOil = press.getOil(new Olive[]{new Kalamata(), new Ligurian(), new Kalamata(), new SomeNewOlive()});

        System.out.println("You got " + totalOil + " units of oil");

        System.out.println("ENUM values method");
        OliveName[] oliveNameArr = OliveName.values();
        for (OliveName oliveName : oliveNameArr)  {
            System.out.println(oliveName.name());
        }

        OliveColor[] oliveColors = OliveColor.values();
        for (OliveColor oliveColor : oliveColors) {
            System.out.println(oliveColor);
        }


        System.out.println("TESTING COMPARABLE INTERFACE");
        Set<Olive> oliveSet = new TreeSet<>();
        oliveSet.add(new Alfafara());
        oliveSet.add(new Kalamata());
        oliveSet.add(new Ligurian());
        oliveSet.add(new SomeNewOlive());
        oliveSet.forEach(System.out::println);


        System.out.println("TESTING COMPARATOR INTERFACE");
        Olive[] olives = new Olive[]{new SomeNewOlive(), new Kalamata(), new Ligurian(), new SomeNewOlive(), new Alfafara(), new SomeNewOlive()};
        System.out.println("UNSORTED ARR");
        for (Olive o : olives) {
            System.out.println(o.getName());
        }
        Arrays.sort(olives, oliveOilComparator);
        System.out.println("SORTED ARR");
        for (Olive o : olives) {
            System.out.println(o.getName());
        }

        System.out.println("TESTING COMPARATOR INTERFACE FROM SEPARATE CLASS");
        Olive[] olives1 = new Olive[]{new SomeNewOlive(), new Kalamata(), new Ligurian(), new SomeNewOlive(), new Alfafara(), new SomeNewOlive()};
        System.out.println("UNSORTED ARR");
        for (Olive o : olives1) {
            System.out.println(o.getName());
        }
        Arrays.sort(olives1, OliveSorter.oliveOilComparator);
        for (Olive o : olives1) {
            System.out.println(o.getName());
        }

        System.out.println("TESTING OLIVE PICKER");
        Olive[] bigOlives = picker.getBigOlives(new Olive[]{new SomeNewOlive(), new Kalamata(), new Ligurian(), new SomeNewOlive(), new Alfafara(), new SomeNewOlive()});
        for (Olive o : bigOlives) {
            System.out.println(o);
        }


        System.out.println("EXCEPTIONS BLOCK");
        try {
            int[] ints = new int[3];
            ints[5] = 33;
            ints[1] = Integer.parseInt("steasd");
            System.out.println(ints[1]);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("EXCEPTIONS HANDLED");
            exception.printStackTrace();
        }
        catch (NumberFormatException exception) {
            System.out.println("ERROR WHILE PARSING INTEGER");
            exception.printStackTrace();
        }

        System.out.println("THROW EXCEPTION BLOCK");

        try {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x > 10) {
                throw new Exception("Number should be less than 10");
            }

            System.out.println("X = " + x);

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println("POST EXCEPTIONS BLOCK");
        System.out.println("PROGRAM CONTINUES IT'S EXECUTION");
    }
}
