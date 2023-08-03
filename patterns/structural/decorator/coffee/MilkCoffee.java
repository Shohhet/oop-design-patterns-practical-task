package patterns.structural.decorator.coffee;

public class MilkCoffee implements CoffeeDrink{
    private final CoffeeDrink coffeeDrink;
    private final String composition = " with milk";
    private final double price = 0.5d;

    public MilkCoffee(CoffeeDrink coffeeDrink) {
        this.coffeeDrink = coffeeDrink;
    }

    @Override
    public String getComposition() {
        return coffeeDrink.getComposition() + composition;
    }

    @Override
    public double getCost() {
        return coffeeDrink.getCost() + price;
    }
}
