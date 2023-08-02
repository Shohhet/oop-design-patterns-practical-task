package patterns.structural.composite.firealarm;

import java.util.ArrayList;
import java.util.List;

public class LineController extends FireAlarmDevice implements Connectable {
    private final List<FireAlarmDevice> connectedDevices = new ArrayList<>();

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
                return "Line controller #" + address + " " + currentDeviceStatus;
            }
        }
        return "NORMAL";
    }
}
