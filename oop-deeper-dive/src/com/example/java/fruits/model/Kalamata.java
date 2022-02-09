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
