package patterns.structural.adapter.actors;

import patterns.structural.adapter.data.USBData;

public class RS485toUSBConverter implements USB {
    private RS485Transmitter transmitter;

    public void connectToRS485(RS485Transmitter transmitter) {
        this.transmitter = transmitter;
    }

    @Override
    public USBData transmitToUSB() {
        return new USBData(transmitter.transmitToRs485().getContent());
    }
}
