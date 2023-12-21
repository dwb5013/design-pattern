package org.example.chapter1;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super.setFlyBehavior(new FlyWithWings());
        super.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
