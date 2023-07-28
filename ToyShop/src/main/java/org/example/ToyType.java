package org.example;

public  enum ToyType {
    ROBOT("Robot", 2),
    CONSTRUCTOR("Constructor", 2),
    DOLL("Doll", 5);
    private String title;
    private int frequency;
    ToyType(String title, int frequency) {
        this.title = title;
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getTitle() {
        return title;
    }
}
