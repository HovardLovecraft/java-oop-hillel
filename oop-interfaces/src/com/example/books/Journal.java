package com.example.books;

import com.example.books.blueprint.Printable;

public class Journal implements Printable {

    private String name;

    public Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
