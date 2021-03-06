package com.example.java.fruits.model;

import com.example.java.characteristics.OliveColor;
import com.example.java.characteristics.OliveName;
import com.example.java.fruits.Olive;

public class Ligurian extends Olive {
    public Ligurian() {
        super(OliveName.LIGURIAN, OliveColor.BLACK, 5);
    }

    @Override
    public String getOrigin() {
        return "Italy";
    }

    @Override
    public int compareTo(Olive o) {
        if(this.crush() == o.crush()) {
            return 0;
        }
        else if (this.crush() > o.crush()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
