package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.dishes.Dish;
import patterns.creational.abstractfactory.menufactory.MenuFactory;

import java.util.List;

public class Menu {
    private final List<Dish> menuList;

    public Menu(MenuFactory factory) {
        menuList = List.of(
                factory.createBreakfast(),
                factory.createLunch(),
                factory.createDinner());
    }
    public void print() {
        System.out.println("Today menu:");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(i + ". " + menuList.get(i).getName());
        }
    }
}
