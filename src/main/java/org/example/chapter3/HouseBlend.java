package org.example.chapter3;

public class HouseBlend extends Beverage {
    public HouseBlend(Size size) {
        super(size, "House Blend Coffee");
    }

    public double cost() {
        return .89;
    }
}

