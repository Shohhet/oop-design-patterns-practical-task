package patterns.behavioral.state;

import patterns.behavioral.state.trafficlight.RedState;
import patterns.behavioral.state.trafficlight.TrafficLight;

public class StateRunner {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(new RedState());
        trafficLight.turnOn();

    }
}
