package patterns.behavioral.strategy;

import patterns.behavioral.strategy.navigator.CarRoute;
import patterns.behavioral.strategy.navigator.Navigator;
import patterns.behavioral.strategy.navigator.PublicTransportRoute;
import patterns.behavioral.strategy.navigator.WalkingRoute;

public class StrategyRunner {
    public static void main(String[] args) {
        Navigator twoGISNavigator = new Navigator(new PublicTransportRoute());
        twoGISNavigator.buildRoute("Karl Marx street", "Lenina street");
        twoGISNavigator.setRouteStrategy(new WalkingRoute());
        twoGISNavigator.buildRoute("Stolby", "Chernaya sopka");
        twoGISNavigator.setRouteStrategy(new CarRoute());
        twoGISNavigator.buildRoute("Krasnoyarsk", "Novosibirsk");

    }
}
