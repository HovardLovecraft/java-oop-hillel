package com.example.java.characteristics;

public enum OliveName {
    KALAMATA("Kalamata"),
    LIGURIAN("Ligurian"),
    ALFAFARA("Alfafara"),
    SOME_NEW_OLIVE("Some new olive");

    private String name;

    OliveName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
