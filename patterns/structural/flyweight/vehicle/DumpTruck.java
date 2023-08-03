package patterns.structural.flyweight.vehicle;

import patterns.structural.flyweight.cargo.Cargo;

public class DumpTruck implements Vehicle{
    public final String name = "Dump truck";

    @Override
    public void deliver(Cargo cargo) {
        System.out.println("Transporting " + cargo.getCargoType());
    }

    @Override
    public String toString() {
        return "Dump truck";
    }
}
