package com.example.books.blueprint;

public interface Printable {
    void print();
    static void read() {
        System.out.println("Read printable");
    }
}
