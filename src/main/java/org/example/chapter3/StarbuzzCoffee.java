package org.example.chapter3;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso(Beverage.Size.GRANDE);
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast(Beverage.Size.TALL);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend(Beverage.Size.VENTI);
        beverage3 = new Milk(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
