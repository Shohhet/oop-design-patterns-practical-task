package patterns.creational.factorymethod;


import patterns.creational.factorymethod.storage.Storage;
import patterns.creational.factorymethod.storagecreator.StorageCreator;

public final class StorageInitializer {
    public static Storage getStorage(StorageCreator creator) {
        return creator.create();
    }
}
