package patterns.structural.flyweight.cargo;

public enum CargoType {
    COAL("coal"),
    CONCRETE("concrete"),
    TIMBER("timber"),
    CONSTRUCTION_MACHINERY("construction machinery");
    final String name;

    CargoType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
