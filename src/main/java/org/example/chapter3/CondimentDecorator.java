package org.example.chapter3;

public abstract class CondimentDecorator extends Beverage {
    final Beverage beverage;

    public CondimentDecorator(Beverage beverage, String description) {
        super(beverage.getSize(), String.join(", ", beverage.getDescription(), description));
        this.beverage = beverage;
    }
}
