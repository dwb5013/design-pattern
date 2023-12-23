package org.example.chapter3;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        super(size, "Espresso");
    }

    public double cost() {
        return 1.99;
    }
}

