package patterns.creational.factorymethod.storage;

public class InMemoryStorage implements Storage {
    private final String connection;

    public InMemoryStorage() {
        connection = "Redis storage connection";
    }

    @Override
    public String getConnection() {
        return connection;
    }
}
