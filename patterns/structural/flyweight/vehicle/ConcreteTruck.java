package patterns.structural.flyweight.vehicle;

import patterns.structural.flyweight.cargo.Cargo;

public class ConcreteTruck implements Vehicle{
    public final String name = "Concrete truck";
    @Override
    public void deliver(Cargo cargo) {
        System.out.println("Transporting " + cargo.getCargoType());
    }

    @Override
    public String toString() {
        return "Concrete truck";
    }
}
