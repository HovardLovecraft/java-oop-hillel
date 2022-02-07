package com.example.books.model;

import com.example.books.Book;

public class LordOfTheRings extends Book {
    public LordOfTheRings(String author, String name) {
        super(author, name);
    }

    @Override
    public void print() {
        System.out.println("John Tolkien");
    }
}
