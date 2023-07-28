package org.example;

public class ToySell extends Toy {
    private static int counter = 1000;
    private final int id;
    {
        id = ++counter;
    }

    public ToySell(ToyType toyType, int quantity, int frequency) {
        super(toyType, quantity, frequency);
    }

    public ToySell(ToyType toyType, int quantity) {
        super(toyType, quantity);
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "ID: " + id + "; Type: " + getToyType().getTitle() + "; Quantity: " + getQuantity() +"; frequency: " + getFrequency();
    }
}
