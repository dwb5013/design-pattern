package org.example.chapter1;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    void performFly() {
        this.flyBehavior.fly();
    }

    void performQuack() {
        this.quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
