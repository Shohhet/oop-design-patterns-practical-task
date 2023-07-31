package patterns.creational.abstractfactory.dishes.lunch;

public class DietLunchDish implements LunchDish{
    private final String name;

    public DietLunchDish() {
        name = "Broccoli soup";
    }

    @Override
    public String getName() {
        return name;
    }
}
