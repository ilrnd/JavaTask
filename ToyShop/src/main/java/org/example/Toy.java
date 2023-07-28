package org.example;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

abstract public class Toy{
    private ToyType toyType;
    private int frequency;

    private int quantity;

    private int id;

    public Toy(ToyType toyType, int quantity, int frequency) {
        this.toyType = toyType;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public Toy(ToyType toyType, int quantity){
        this.toyType = toyType;
        this.quantity = quantity;
        this.frequency = toyType.getFrequency();

    }

    public Toy(ToyType toyType) {
        this.toyType = toyType;
        this.frequency = toyType.getFrequency();

    }

    public int getFrequency() {
        return frequency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public ToyType getToyType() {
        return toyType;
    }

    public int getId() {
        return id;
    }
}
