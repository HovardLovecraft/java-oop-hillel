package com.example.java;

import com.example.java.characteristics.OliveColor;
import com.example.java.fruits.Olive;
import com.example.java.fruits.model.Alfafara;
import com.example.java.fruits.model.Kalamata;
import com.example.java.fruits.model.Ligurian;
import com.example.java.fruits.model.SomeNewOlive;

import java.util.*;

public class CollectionsRunner {

    public static void main(String[] args) {

        Queue<Olive> oliveQueue = new LinkedList<>();
        ArrayDeque<Olive> oliveArrayDeque = new ArrayDeque<>();
        LinkedList<Olive> oliveList = new LinkedList<>();
        Map<OliveColor, Olive> oliveMap = new HashMap<>();
        Map<Integer, String> map = new HashMap<>();

        oliveQueue.offer(new Kalamata());
        oliveQueue.offer(new Ligurian());
        oliveQueue.offer(new SomeNewOlive());
        oliveQueue.offer(new Alfafara());

        System.out.println("QUEUE INTERFACE");
        System.out.println(oliveQueue.peek());
        System.out.println("OLIVE QUEUE WITHOUT REMOVAL");
        oliveQueue.forEach(System.out::println);
        System.out.println(oliveQueue.poll());
        System.out.println("OLIVE QUEUE WITH REMOVAL");
        oliveQueue.forEach(System.out::println);

        System.out.println("DEQUE INTERFACE");
        oliveArrayDeque.add(new Alfafara());
        oliveArrayDeque.addFirst(new Kalamata());
        oliveArrayDeque.push(new SomeNewOlive());
        oliveArrayDeque.addLast(new Ligurian());
        oliveArrayDeque.add(new Alfafara());
        oliveArrayDeque.forEach(System.out::println);

        System.out.println("LINKED LIST CLASS");
        oliveList.add(new Alfafara());
        oliveList.addLast(new Ligurian());
        oliveList.addFirst(new SomeNewOlive());
        oliveList.add(new Kalamata());

        System.out.println("Getting element by index" + oliveList.get(0));

        System.out.println("Peeking first element without removal");
        System.out.println(oliveList.peekFirst());
        oliveList.forEach(System.out::println);

        System.out.println("Peeking first element with removal");
        System.out.println(oliveList.pollFirst());
        oliveList.forEach(System.out::println);


        System.out.println("MAP INTERFACE");
        oliveMap.put(OliveColor.PURPLE, new Kalamata());
        oliveMap.put(OliveColor.BLACK, new Ligurian());
        oliveMap.put(OliveColor.GREEN, new Alfafara());
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");


        System.out.println(oliveMap.containsKey(OliveColor.BLUE));
        System.out.println(oliveMap.containsValue(new Kalamata()));
        System.out.println(oliveMap.isEmpty());
        oliveMap.entrySet().forEach(System.out::println);
        map.entrySet().forEach(System.out::println);
        oliveMap.keySet().forEach(System.out::println);
        oliveMap.values().forEach(System.out::println);
        System.out.println(oliveMap.get(OliveColor.PURPLE));
        for (Map.Entry<OliveColor, Olive> oliveEntry : oliveMap.entrySet() ) {
            System.out.printf("Key: %s " + "Value %s \n", oliveEntry.getKey(), oliveEntry.getValue());
        }







    }
}
