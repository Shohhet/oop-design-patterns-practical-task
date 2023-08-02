package patterns.structural.composite;

import patterns.structural.composite.firealarm.CentralControlUnit;
import patterns.structural.composite.firealarm.FireAlarmInterface;
import patterns.structural.composite.firealarm.FireSensor;
import patterns.structural.composite.firealarm.LineController;

public class CompositeRunner {
    public static void main(String[] args) {

        CentralControlUnit centralControlUnit = new CentralControlUnit(1);
        LineController lineController1 = new LineController();
        LineController lineController2 = new LineController();

        centralControlUnit.connectDevice(lineController1);
        centralControlUnit.connectDevice(lineController2);

        for (int i = 0; i < 5; i++) {
            lineController1.connectDevice(new FireSensor());
            lineController2.connectDevice(new FireSensor());
        }

        FireAlarmInterface alarmInterface = new FireAlarmInterface(centralControlUnit);
        alarmInterface.showStatus();

        FireSensor fireSensor = new FireSensor();
        lineController2.connectDevice(fireSensor);
        fireSensor.detectFire();

        alarmInterface.showStatus();
        }
}
