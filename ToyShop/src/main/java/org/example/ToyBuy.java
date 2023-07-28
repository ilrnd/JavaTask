package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ToyBuy extends Toy{

    private static int counter = 9000;
    private final int id;
    {
        id = ++counter;
    }


    public ToyBuy(ToyType toyType) {
        super(toyType);
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "ID: " + id + "; Type: " + getToyType().getTitle() ;
    }
}

