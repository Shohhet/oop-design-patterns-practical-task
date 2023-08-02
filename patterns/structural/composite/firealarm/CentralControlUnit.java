package patterns.structural.composite.firealarm;

import java.util.ArrayList;
import java.util.List;

public class CentralControlUnit extends FireAlarmDevice implements Connectable {
    private final List<FireAlarmDevice> connectedDevices;

    public CentralControlUnit(int address) {
        connectedDevices = new ArrayList<>();
        this.address = address;
    }
    @Override
    public void connectDevice(FireAlarmDevice device)  {
        connectedDevices.add(device);
        device.setAddress(connectedDevices.size() - 1);

    }

    @Override
    public String pollStatus() {
        for (FireAlarmDevice device: connectedDevices) {
            String currentDeviceStatus = device.pollStatus();
            if (!"NORMAL".equals(currentDeviceStatus)) {
                return "Central control unit #" + address + " " + currentDeviceStatus;
            }
        }
        return "NORMAL";
    }
}
