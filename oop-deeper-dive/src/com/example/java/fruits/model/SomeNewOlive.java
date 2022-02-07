package com.example.java.fruits.model;

import com.example.java.characteristics.OliveColor;
import com.example.java.characteristics.OliveName;
import com.example.java.fruits.Olive;

public class SomeNewOlive extends Olive {
    public SomeNewOlive(OliveName name, OliveColor color, int oil) {
        super(name, color, oil);
    }

    @Override
    protected String getOrigin() {
        return "Cyprus";
    }
}
