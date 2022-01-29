package com.example.java.fruits;

import com.example.java.characteristics.OliveColor;
import com.example.java.characteristics.OliveName;

import java.util.Objects;

public abstract class Olive {

    private OliveName name;
    private OliveColor color;
    private int oil;

    public Olive(OliveName name, OliveColor color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    public int crush() {
        System.out.println(name + " - from " + getOrigin() + ": " + oil + " units of oil");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    protected abstract String getOrigin();

    @Override
    public String toString() {
        return name.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Olive olive = (Olive) o;
        return oil == olive.oil && name == olive.name && color == olive.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, oil);
    }
}
