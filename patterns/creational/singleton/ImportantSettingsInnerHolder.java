package patterns.creational.singleton;


public class ImportantSettingsInnerHolder {
    private String value;
    private static class SettingsHolder {
        private static final ImportantSettingsInnerHolder INSTANCE = new ImportantSettingsInnerHolder();
    }
    public static ImportantSettingsInnerHolder getInstance() {
        return SettingsHolder.INSTANCE;
    }
    private ImportantSettingsInnerHolder() {
        value = "Default inner holder settings";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
