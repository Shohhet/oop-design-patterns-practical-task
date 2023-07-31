package patterns.creational.singleton;


public class SingletonRunner {
    public static void main(String[] args) {
        var settings = ImportantSettingsDclLazyInit.getInstance();
        System.out.println(settings.getValue());
        settings.setValue("New multi thread settings");
        var settings2 = ImportantSettingsDclLazyInit.getInstance();
        System.out.println(settings2.getValue());
        System.out.println(settings.equals(settings2));
        System.out.println();

        var enumSettings = ImportantSettingsEnumSingleton.INSTANCE;
        System.out.println(enumSettings.getValue());
        enumSettings.setValue("New enum settings");
        var enumSettings2 = ImportantSettingsEnumSingleton.INSTANCE;
        System.out.println(enumSettings2.getValue());
        System.out.println(enumSettings.equals(enumSettings2));
        System.out.println();

        var innerHolderSettings = ImportantSettingsInnerHolder.getInstance();
        System.out.println(innerHolderSettings.getValue());
        innerHolderSettings.setValue("New inner holder settings");
        var innerHolderSettings2 = ImportantSettingsInnerHolder.getInstance();
        System.out.println(innerHolderSettings2.getValue());
        System.out.println(innerHolderSettings.equals(innerHolderSettings2));
        System.out.println();

    }
}
