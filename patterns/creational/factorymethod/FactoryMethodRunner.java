package patterns.creational.factorymethod;

import patterns.creational.factorymethod.storage.Storage;
import patterns.creational.factorymethod.storagecreator.InMemoryStorageCreator;
import patterns.creational.factorymethod.storagecreator.NoSqlStorageCreator;
import patterns.creational.factorymethod.storagecreator.SqlStorageCreator;

public class FactoryMethodRunner {
    public static void main(String[] args) {
        Storage storage = StorageInitializer.getStorage(new InMemoryStorageCreator());
        System.out.println(storage.getConnection());
        storage = StorageInitializer.getStorage(new SqlStorageCreator());
        System.out.println(storage.getConnection());
        storage = StorageInitializer.getStorage(new NoSqlStorageCreator());
        System.out.println(storage.getConnection());
    }
}
