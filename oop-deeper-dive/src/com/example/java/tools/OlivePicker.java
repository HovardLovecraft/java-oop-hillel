package com.example.java.tools;

import com.example.java.fruits.Olive;

import java.util.ArrayList;
import java.util.List;

public class OlivePicker {

    public Olive[] getBigOlives(Olive[] olives) {

        Olive[] result = new Olive[olives.length];
        List<Olive> list = new ArrayList<>();

        for (int i = 0; i < olives.length; i++) {
            if (olives[i].crush() > 4) {
                result[i] = olives[i];
            }
        }

        for (Olive olive : result) {
            if (olive != null) {
                list.add(olive);
            }
        }

        return list.toArray((new Olive[0]));
    }

}
