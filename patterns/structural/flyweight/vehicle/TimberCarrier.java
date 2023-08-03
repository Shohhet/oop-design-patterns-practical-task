package patterns.structural.flyweight.vehicle;

import patterns.structural.flyweight.cargo.Cargo;

public class TimberCarrier implements Vehicle {
    public final String name = "Timber carrier";

    @Override
    public void deliver(Cargo cargo) {
        System.out.println("Transporting " + cargo.getCargoType());
    }

    @Override
    public String toString() {
        return "Timber carrier";
    }
}
