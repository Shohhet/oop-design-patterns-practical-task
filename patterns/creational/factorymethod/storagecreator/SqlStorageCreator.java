package patterns.creational.factorymethod.storagecreator;

import patterns.creational.factorymethod.storage.SqlStorage;
import patterns.creational.factorymethod.storage.Storage;

public class SqlStorageCreator implements StorageCreator{
    @Override
    public Storage create() {
        return new SqlStorage();
    }
}
