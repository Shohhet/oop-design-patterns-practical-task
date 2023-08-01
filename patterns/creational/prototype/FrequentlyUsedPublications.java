package patterns.creational.prototype;

import patterns.creational.prototype.publication.Publication;

import java.util.HashMap;
import java.util.Map;

public class FrequentlyUsedPublications {
    private final Map<String, Publication> rack = new HashMap<>();
    public Publication get(String key) {
        return rack.get(key).getCopy();
    }

    public void put(String key, Publication publication) {
        rack.put(key, publication);
    }

}
