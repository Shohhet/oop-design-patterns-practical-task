package patterns.creational.abstractfactory.dishes.breakfast;

public class DietBreakfastDish implements BreakfastDish{
    private final String name;

    public DietBreakfastDish() {
        name = "Oatmeal in water";
    }

    @Override
    public String getName() {
        return name;
    }
}
