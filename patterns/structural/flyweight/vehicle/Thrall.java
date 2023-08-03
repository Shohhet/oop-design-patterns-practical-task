package patterns.structural.flyweight.vehicle;

import patterns.structural.flyweight.cargo.Cargo;

public class Thrall implements Vehicle {
    public final String name = "Thrall";

    @Override
    public void deliver(Cargo cargo) {
        System.out.println("Transporting " + cargo.getCargoType());
    }

    @Override
    public String toString() {
        return "Thrall";
    }
}
