package patterns.behavioral.state.trafficlight;

public class TrafficLight {
    private State state;

    public TrafficLight(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnOn() {
        for (int i = 0; i < 10; i++) {
            state.beam();
            state.next(this);
            System.out.println("========================");
        }
    }



}
