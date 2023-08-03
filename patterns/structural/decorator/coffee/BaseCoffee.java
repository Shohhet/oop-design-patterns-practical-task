package patterns.structural.decorator.coffee;

public class BaseCoffee implements CoffeeDrink{
    private final double price = 1.0d;
    private final String composition = "Java coffee";
    @Override
    public String getComposition() {
        return composition;
    }

    @Override
    public double getCost() {
        return price;
    }
}
