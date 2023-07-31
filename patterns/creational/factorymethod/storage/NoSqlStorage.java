package patterns.creational.factorymethod.storage;

public class NoSqlStorage implements Storage{
    String connection;

    public NoSqlStorage() {
        connection = "Mongo DB storage connection";
    }

    @Override
    public String getConnection() {
        return connection;
    }
}
