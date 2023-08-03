package patterns.structural.decorator.coffee;

public class SyrupCoffee implements CoffeeDrink{
    private final CoffeeDrink coffeeDrink;
    private final String composition = " with caramel syrup";
    private final double price = 0.3d;

    public SyrupCoffee(CoffeeDrink coffeeDrink) {
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
