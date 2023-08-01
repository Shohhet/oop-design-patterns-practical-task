package patterns.structural.adapter;

import patterns.structural.adapter.actors.RS485Transmitter;
import patterns.structural.adapter.actors.RS485toUSBConverter;
import patterns.structural.adapter.actors.USBReceiver;
import patterns.structural.adapter.actors.USBTransmitter;

public class AdapterRunner {
    public static void main(String[] args) {
        RS485Transmitter RS485transmitter = new RS485Transmitter("some data from RS485 interface");
        USBTransmitter USBtransmitter = new USBTransmitter("some data from USB interface");
        RS485toUSBConverter converter = new RS485toUSBConverter();
        converter.connectToRS485(RS485transmitter);
        USBReceiver receiver =  new USBReceiver();
        receiver.receiveFromUsb(USBtransmitter.transmitToUSB());
        receiver.receiveFromUsb(converter.transmitToUSB());

    }
}
