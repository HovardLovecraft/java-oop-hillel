package com.example.java.tools;

import com.example.java.fruits.Olive;

import java.util.List;

public interface IPress {
    public int getOil(List<Olive> oliveList);
    public int getOil(Olive[] olives);
    public int getOil(Olive olive);
    public void setOil(int oil);

}
