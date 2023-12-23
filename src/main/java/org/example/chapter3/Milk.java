package org.example.chapter3;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage, "Milk");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5d;
    }
}
