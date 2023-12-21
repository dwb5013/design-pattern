package org.example.chapter1;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super.setFlyBehavior(new FlyNoWay());
        super.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
