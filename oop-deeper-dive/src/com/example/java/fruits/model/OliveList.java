package com.example.java.fruits.model;

import com.example.java.characteristics.OliveName;
import com.example.java.fruits.Olive;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OliveList {

    private List<Olive> oliveList = new ArrayList<>();

    public void addKalamata() {
        int id = oliveList.size() + 1;
        Olive kalamata = new Kalamata();
        oliveList.add(kalamata);
    }

    public void addOlive(Olive olive) {
        int id = oliveList.size() + 1;
        if (olive.getName().equals(OliveName.KALAMATA)) {
            Olive kalamata = new Kalamata();
            oliveList.add(kalamata);
        } else if (olive.getName().equals(OliveName.ALFAFARA)){
            Olive alfafara = new Kalamata();
            oliveList.add(alfafara);
        } else if (olive.getName().equals(OliveName.SOME_NEW_OLIVE)){
            Olive someNewOlive = new SomeNewOlive();
            oliveList.add(someNewOlive);
        } else if (olive.getName().equals(OliveName.LIGURIAN)){
            Olive ligurian = new Ligurian();
            oliveList.add(ligurian);
        }
    }

    public List<Olive> getOliveList() {
        return new ArrayList<>(oliveList);
    }

    public List<Olive> getSortedOlivesList(Comparator<Olive> comparator) {
        List<Olive> resultList = this.getOliveList();
        resultList.sort(comparator);
        return resultList;
    }

}
