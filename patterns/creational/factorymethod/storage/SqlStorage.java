package patterns.creational.factorymethod.storage;

public class SqlStorage implements Storage {
    private final String connection;

    public SqlStorage() {
        connection = "MS SQL storage connection";
    }

    @Override
    public String getConnection() {
        return connection;
    }
}
