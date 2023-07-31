package patterns.creational.abstractfactory.dishes.lunch;

public class StandardLunchDish implements LunchDish{
    private final String name;

    public StandardLunchDish() {
        name = "Borscht with bread and lard";
    }

    @Override
    public String getName() {
        return name;
    }
}
