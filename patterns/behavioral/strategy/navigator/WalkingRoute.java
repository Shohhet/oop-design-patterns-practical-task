package patterns.behavioral.strategy.navigator;

public class WalkingRoute implements RouteStrategy {
    @Override
    public void buildRoute(String from, String to) {
        System.out.println("Route from " + from + " to " + to + " for pedestrians.");
    }
}
