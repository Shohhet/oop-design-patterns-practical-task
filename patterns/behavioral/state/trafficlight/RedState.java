package patterns.behavioral.state.trafficlight;

public class RedState implements State{
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }

    @Override
    public void beam() {
        System.out.println("RED");
    }
}
