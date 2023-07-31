package patterns.creational.abstractfactory.dishes.dinner;

public class DietDinnerDish implements DinnerDish{
    private final String name;

    public DietDinnerDish() {
        name = "Vegetable cutlets";
    }

    @Override
    public String getName() {
        return name;
    }
}
