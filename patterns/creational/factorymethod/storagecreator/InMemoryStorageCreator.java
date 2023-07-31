package patterns.creational.factorymethod.storagecreator;

import patterns.creational.factorymethod.storage.InMemoryStorage;
import patterns.creational.factorymethod.storage.Storage;

public class InMemoryStorageCreator implements StorageCreator{
    @Override
    public Storage create() {
        return new InMemoryStorage();
    }
}
