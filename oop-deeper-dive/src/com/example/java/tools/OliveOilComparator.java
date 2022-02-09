package com.example.java.tools;

import com.example.java.fruits.Olive;

import java.util.Comparator;

public class OliveOilComparator implements Comparator<Olive> {

    @Override
    public int compare(Olive o1, Olive o2) {
        return o1.crush() - o2.crush();
    }
}
