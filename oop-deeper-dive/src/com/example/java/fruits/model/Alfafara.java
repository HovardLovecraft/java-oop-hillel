package com.example.java.fruits.model;

import com.example.java.characteristics.OliveColor;
import com.example.java.characteristics.OliveName;
import com.example.java.fruits.Olive;

public class Alfafara extends Olive {

    public Alfafara() {
        super(OliveName.ALFAFARA, OliveColor.GREEN, 7);
    }


    @Override
    protected String getOrigin() {
        return "Spain";
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
