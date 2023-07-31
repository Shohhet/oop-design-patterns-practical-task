package patterns.creational.singleton;

public class ImportantSettingsDclLazyInit {
    private static volatile ImportantSettingsDclLazyInit INSTANCE;
    private String value = "Default multi thread settings";

    private ImportantSettingsDclLazyInit() {
    }

    public static ImportantSettingsDclLazyInit getInstance() {
        if (INSTANCE == null) {
            synchronized (ImportantSettingsDclLazyInit.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ImportantSettingsDclLazyInit();
                }
            }
        }
        return INSTANCE;
    }

    public synchronized String getValue() {
        return value;
    }

    public synchronized void setValue(String value) {
        this.value = value;
    }

}
