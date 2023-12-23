package org.example.chapter3;

public class DarkRoast extends Beverage {
    public DarkRoast(Size size) {
        super(size, "Dark Roast Coffee");
    }

    public double cost() {
        return .99;
    }
}

