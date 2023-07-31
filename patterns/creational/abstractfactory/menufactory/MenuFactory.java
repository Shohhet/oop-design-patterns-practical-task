package patterns.creational.abstractfactory.menufactory;

import patterns.creational.abstractfactory.dishes.breakfast.BreakfastDish;
import patterns.creational.abstractfactory.dishes.dinner.DinnerDish;
import patterns.creational.abstractfactory.dishes.lunch.LunchDish;

public interface MenuFactory {
    BreakfastDish createBreakfast();
    LunchDish createLunch();
    DinnerDish createDinner();
}
