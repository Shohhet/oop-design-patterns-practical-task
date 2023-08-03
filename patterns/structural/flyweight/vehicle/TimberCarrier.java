package patterns.structural.flyweight.vehicle;

import patterns.structural.flyweight.cargo.Cargo;

public class TimberCarrier implements Vehicle {
    @Override
    public void deliverCargo(Cargo cargo) {
        System.out.println("Transporting " + cargo.getCargoType());
    }
}
