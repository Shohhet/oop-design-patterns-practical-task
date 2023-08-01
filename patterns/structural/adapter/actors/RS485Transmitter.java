package patterns.structural.adapter.actors;

import patterns.structural.adapter.data.RS485Data;

public class RS485Transmitter {
    private final String data;

    public RS485Transmitter(String data) {
        this.data = data;
    }

    RS485Data transmitToRs485() {
        return new RS485Data(data);
    }

}
