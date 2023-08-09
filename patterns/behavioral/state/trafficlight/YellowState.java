package patterns.behavioral.state.trafficlight;

public class YellowState implements State{
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }

    @Override
    public void beam() {
        System.out.println("YELLOW");
    }
}
