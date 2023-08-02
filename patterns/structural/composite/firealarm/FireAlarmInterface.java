package patterns.structural.composite.firealarm;

public class FireAlarmInterface {
    private final CentralControlUnit centralControlUnit;

    public FireAlarmInterface(CentralControlUnit centralControlUnit) {
        this.centralControlUnit = centralControlUnit;
    }

    public void showStatus() {
        System.out.println(centralControlUnit.pollStatus());
    }
}
