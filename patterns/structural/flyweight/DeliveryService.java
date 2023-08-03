package patterns.structural.flyweight;

import patterns.structural.flyweight.cargo.Cargo;
import patterns.structural.flyweight.cargo.CargoType;
import patterns.structural.flyweight.vehicle.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class DeliveryService {
    Map<CargoType, Vehicle> garage = new HashMap<>();
    public Vehicle makeTransportOrder(Cargo cargo) {
        switch (cargo.getCargoType()) {
            case COAL -> {
                if (garage.containsKey(CargoType.COAL)) {
                    System.out.println("Take vehicle from garage");
                    yield garage.get(CargoType.COAL)
                }
            }
            case CONCRETE:
            case TIMBER:
            case CONSTRUCTION_MACHINERY:
        }
    }

    private Vehicle getVehicle(CargoType type) {
        if (garage.containsKey(type)) {
            System.out.println("Take vehicle from garage");
            return garage.get(type);
    }
}
