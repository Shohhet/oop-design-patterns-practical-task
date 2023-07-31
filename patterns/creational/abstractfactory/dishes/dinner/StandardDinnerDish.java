package patterns.creational.abstractfactory.dishes.dinner;

public class StandardDinnerDish implements DinnerDish {
    private final String name;

    public StandardDinnerDish() {
        name = "Fish steak with french fries";
    }

    @Override
    public String getName() {
        return name;
    }
}
