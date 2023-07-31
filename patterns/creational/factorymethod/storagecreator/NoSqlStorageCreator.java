package patterns.creational.factorymethod.storagecreator;

import patterns.creational.factorymethod.storage.NoSqlStorage;
import patterns.creational.factorymethod.storage.Storage;

public class NoSqlStorageCreator implements StorageCreator{
    @Override
    public Storage create() {
        return new NoSqlStorage();
    }
}
