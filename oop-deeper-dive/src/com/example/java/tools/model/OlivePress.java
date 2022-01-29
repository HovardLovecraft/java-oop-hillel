package com.example.java.tools.model;

import com.example.java.fruits.Olive;
import com.example.java.tools.IPress;

import java.util.List;

public class OlivePress implements IPress {

    private int currentOil;

    @Override
    public int getOil(List<Olive> oliveList) {
        int totalOil = currentOil;
        for (Olive o: oliveList) {
            System.out.println(o.getName());
            totalOil += o.crush();
        }
        return totalOil;
    }

    @Override
    public int getOil(Olive[] olives) {
        int totalOil = currentOil;
        for (Olive o: olives) {
            System.out.println(o.getName());
            totalOil += o.crush();
        }
        return totalOil;
    }

    @Override
    public int getOil(Olive olive) {
        return currentOil + olive.crush();
    }

    @Override
    public void setOil(int oil) {
        currentOil = oil;
    }
}
