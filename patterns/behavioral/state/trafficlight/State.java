package patterns.behavioral.state.trafficlight;

public interface State {
    void next(TrafficLight trafficLight);
    void beam();
}
