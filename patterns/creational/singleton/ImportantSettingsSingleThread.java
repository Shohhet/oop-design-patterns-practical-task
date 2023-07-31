package patterns.creational.singleton;

public class ImportantSettingsSingleThread {
    private static ImportantSettingsSingleThread INSTANCE    ;
    private String value = "Default settings";

    private ImportantSettingsSingleThread() {
    }

    public static ImportantSettingsSingleThread getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ImportantSettingsSingleThread();
        }
        return INSTANCE;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
