package com.example.java.exceptions;

public class InsufficientAmountOfOilException extends Exception {

    private int amount;

    public InsufficientAmountOfOilException(int amount) {
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
}
