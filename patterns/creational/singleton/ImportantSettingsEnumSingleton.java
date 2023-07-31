package patterns.creational.singleton;

public enum ImportantSettingsEnumSingleton {
    INSTANCE;
    private String value = "Default enum settings";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
