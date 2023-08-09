package patterns.behavioral.strategy.navigator;

public class PublicTransportRoute implements RouteStrategy{
    @Override
    public void buildRoute(String from, String to) {
        System.out.println("Route from " + from + " to " + to + " for travel by bus.");
    }
}
