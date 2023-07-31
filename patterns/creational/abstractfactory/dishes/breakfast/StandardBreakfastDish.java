package patterns.creational.abstractfactory.dishes.breakfast;

public class StandardBreakfastDish implements BreakfastDish{
    private final String name;

    public StandardBreakfastDish() {
        name = "Eggs with bacon";
    }

    @Override
    public String getName() {
        return name;
    }
}
