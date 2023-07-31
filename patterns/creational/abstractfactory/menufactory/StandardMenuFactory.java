package patterns.creational.abstractfactory.menufactory;

import patterns.creational.abstractfactory.dishes.breakfast.BreakfastDish;
import patterns.creational.abstractfactory.dishes.breakfast.StandardBreakfastDish;
import patterns.creational.abstractfactory.dishes.dinner.DinnerDish;
import patterns.creational.abstractfactory.dishes.dinner.StandardDinnerDish;
import patterns.creational.abstractfactory.dishes.lunch.LunchDish;
import patterns.creational.abstractfactory.dishes.lunch.StandardLunchDish;

public class StandardMenuFactory implements MenuFactory {
    @Override
    public BreakfastDish createBreakfast() {
        return new StandardBreakfastDish();
    }

    @Override
    public LunchDish createLunch() {
        return new StandardLunchDish();
    }

    @Override
    public DinnerDish createDinner() {
        return new StandardDinnerDish();
    }
}
