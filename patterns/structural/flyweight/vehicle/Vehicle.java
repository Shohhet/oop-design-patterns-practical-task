package patterns.structural.flyweight.vehicle;

import patterns.structural.flyweight.cargo.Cargo;

public interface Vehicle {
    void deliverCargo(Cargo cargo);
}
