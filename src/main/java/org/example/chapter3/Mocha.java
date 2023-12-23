package org.example.chapter3;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage, "Mocha");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.9d;
    }
}
