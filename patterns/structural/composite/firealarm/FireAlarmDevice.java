package patterns.structural.composite.firealarm;

public abstract class FireAlarmDevice {
    protected int address = 0;

    void setAddress(int address) {
        this.address = address;
    }

    abstract String pollStatus();
}
