package patterns.structural.flyweight;

import patterns.structural.flyweight.cargo.Cargo;
import patterns.structural.flyweight.cargo.CargoType;

import java.util.Random;

public class FlyweightRunner {
    private static final Random random = new Random();
    private static final CargoType[] cargoTypes = CargoType.values();

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        for (int i = 0; i < 10; i++) {
            deliveryService.deliver(getRandomTypeCargo());
        }
    }

    private static Cargo getRandomTypeCargo() {
        return new Cargo(cargoTypes[random.nextInt(cargoTypes.length)]);
    }
}
