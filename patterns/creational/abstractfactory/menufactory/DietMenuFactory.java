package patterns.creational.abstractfactory.menufactory;

import patterns.creational.abstractfactory.dishes.breakfast.BreakfastDish;
import patterns.creational.abstractfactory.dishes.breakfast.DietBreakfastDish;
import patterns.creational.abstractfactory.dishes.dinner.DietDinnerDish;
import patterns.creational.abstractfactory.dishes.dinner.DinnerDish;
import patterns.creational.abstractfactory.dishes.lunch.DietLunchDish;
import patterns.creational.abstractfactory.dishes.lunch.LunchDish;

public class DietMenuFactory implements MenuFactory{
    @Override
    public BreakfastDish createBreakfast() {
        return new DietBreakfastDish();
    }

    @Override
    public LunchDish createLunch() {
        return new DietLunchDish();
    }

    @Override
    public DinnerDish createDinner() {
        return new DietDinnerDish();
    }
}
