package patterns.creational.singleton;


public class SingletonRunner {
    public static void main(String[] args) {
        ImportantSettingsSingleThread settings = ImportantSettingsSingleThread.getInstance();
        System.out.println(settings.getValue());
        settings.setValue("New settings");
        System.out.println(settings.getValue());
        var settings2 = ImportantSettingsSingleThread.getInstance();
        System.out.println(settings2.getValue());
    }
}
