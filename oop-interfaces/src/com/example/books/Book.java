package com.example.books;

import com.example.books.blueprint.Printable;

public class Book implements Printable {

    String author;
    String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name + author);
    }


}
