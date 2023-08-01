package patterns.structural.adapter.actors;

import patterns.structural.adapter.data.USBData;

public class USBReceiver {
    public void receiveFromUsb(USBData data) {
        System.out.println(data.getContent());
    }
}
