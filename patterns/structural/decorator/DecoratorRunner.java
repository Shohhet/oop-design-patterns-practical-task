package patterns.structural.decorator;

import patterns.structural.decorator.coffee.BaseCoffee;
import patterns.structural.decorator.coffee.CoffeeDrink;
import patterns.structural.decorator.coffee.MilkCoffee;
import patterns.structural.decorator.coffee.SyrupCoffee;

public class DecoratorRunner {
    public static void main(String[] args) {
        CoffeeDrink coffeeWithMilk = new MilkCoffee(new BaseCoffee());
        System.out.println("Composition: " + coffeeWithMilk.getComposition());
        System.out.printf("Price: %.2f", coffeeWithMilk.getCost());
        System.out.println();

        CoffeeDrink coffeeWithMilkAndSyrup = new SyrupCoffee(new MilkCoffee(new BaseCoffee()));
        System.out.println("Composition: " + coffeeWithMilkAndSyrup.getComposition());
        System.out.printf("Price: %.2f", coffeeWithMilkAndSyrup.getCost());
    }
}
