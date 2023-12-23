package org.example.chapter3;

public abstract class Beverage {
    public Size getSize() {
        return size;
    }

    public enum Size {TALL, GRANDE, VENTI}

    private final Size size;

    private final String description;

    public Beverage(Size size, String description) {
        this.size = size;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
