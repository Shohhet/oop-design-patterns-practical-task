package patterns.structural.flyweight.cargo;

public class Cargo {
    private CargoType cargoType;

    public Cargo(CargoType cargoType) {
        this.cargoType = cargoType;
    }

    public CargoType getCargoType() {
        return cargoType;
    }
}
