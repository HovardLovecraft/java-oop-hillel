package com.example.java.fruits.model;

import com.example.java.characteristics.OliveColor;
import com.example.java.characteristics.OliveName;
import com.example.java.fruits.Olive;

public class SomeNewOlive extends Olive {

    public SomeNewOlive() {
        super(OliveName.SOME_NEW_OLIVE, OliveColor.BLACK, 1);
    }

    @Override
    protected String getOrigin() {
        return "Cyprus";
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
