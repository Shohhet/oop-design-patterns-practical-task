package patterns.structural.adapter.actors;

import patterns.structural.adapter.data.USBData;

public class USBTransmitter implements USB{
    private final String data;

    public USBTransmitter(String data) {
        this.data = data;
    }

    @Override
    public USBData transmitToUSB() {
        return new USBData(data);
    }
}
