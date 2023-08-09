package patterns.behavioral.strategy.navigator;

public class Navigator {
    RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute(String from, String to) {
        routeStrategy.buildRoute(from, to);
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }
}
