package patterns.structural.flyweight;

import patterns.structural.flyweight.cargo.Cargo;
import patterns.structural.flyweight.cargo.CargoType;
import patterns.structural.flyweight.vehicle.*;

import java.util.HashMap;
import java.util.Map;

public class DeliveryService {
    Map<CargoType, Vehicle> garage = new HashMap<>();
    public void deliver(Cargo cargo) {
        Vehicle vehicle = getVehicle(cargo.getCargoType());
        vehicle.deliver(cargo);
    }

    private Vehicle getVehicle(CargoType type) {
        if (garage.containsKey(type)) {
            Vehicle vehicle = garage.get(type);
            System.out.println("Take " + vehicle + " from garage");
            return garage.get(type);
        }
        switch (type) {
            case COAL -> {
                Vehicle dumpTruck = new DumpTruck();
                System.out.println("Buying new " + dumpTruck);
                garage.put(CargoType.COAL, dumpTruck);
                return dumpTruck;
            }
            case TIMBER -> {
                Vehicle timberCarrier = new TimberCarrier();
                System.out.println("Buying new " + timberCarrier);
                garage.put(CargoType.TIMBER, timberCarrier);
                return timberCarrier;
            }
            case CONCRETE -> {
                Vehicle concreteTruck = new ConcreteTruck();
                System.out.println("Buying new " + concreteTruck);
                garage.put(CargoType.CONCRETE, concreteTruck);
                return concreteTruck;
            }
            case CONSTRUCTION_MACHINERY -> {
                Vehicle thrall = new Thrall();
                System.out.println("Buying new " + thrall);
                garage.put(CargoType.CONSTRUCTION_MACHINERY, thrall);
                return thrall;
            }
            default -> throw new RuntimeException("Can't deliver this type of cargo");
        }
    }
}
