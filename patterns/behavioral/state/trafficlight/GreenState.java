package patterns.behavioral.state.trafficlight;

public class GreenState implements State{
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }

    @Override
    public void beam() {
        System.out.println("GREEN");
    }
}
