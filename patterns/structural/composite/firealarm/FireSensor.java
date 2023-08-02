package patterns.structural.composite.firealarm;

public class FireSensor extends FireAlarmDevice{
    private boolean isFire = false;

    @Override
    String pollStatus() {
        if (isFire) {
           return "Fire sensor #" + address + " FIRE";
        }
        return "NORMAL";
    }

    public void detectFire() {
        isFire = true;
    }

}
