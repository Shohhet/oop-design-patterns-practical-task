package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.menufactory.DietMenuFactory;
import patterns.creational.abstractfactory.menufactory.MenuFactory;
import patterns.creational.abstractfactory.menufactory.StandardMenuFactory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        Menu menu = new Menu(new DietMenuFactory());
        menu.print();
        menu = new Menu(new StandardMenuFactory());
        menu.print();

    }
}
