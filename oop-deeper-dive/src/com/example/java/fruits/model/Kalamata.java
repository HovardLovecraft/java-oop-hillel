package com.example.java.fruits.model;

import com.example.java.characteristics.OliveColor;
import com.example.java.characteristics.OliveName;
import com.example.java.fruits.Olive;

public class Kalamata extends Olive {
    public Kalamata() {
        super(OliveName.KALAMATA, OliveColor.PURPLE, 2);
    }


    @Override
    protected String getOrigin() {
        return "Greece";
    }
}
