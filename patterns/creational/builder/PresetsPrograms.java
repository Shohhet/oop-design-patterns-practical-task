package patterns.creational.builder;

public class PresetsPrograms {

    public static CarWashingProgram getEcoWashProgram(CarWashingProgramBuilder builder) {
        return builder.addMainWash()
                .addRinsing()
                .addDrying()
                .build();
    }

    public static CarWashingProgram getStandardWashProgram(CarWashingProgramBuilder builder) {
        return builder.addPreWash()
                .addMainWash()
                .addDiscWashing()
                .addRinsing()
                .addDrying()
                .build();
    }

    public static CarWashingProgram getFullWashProgram(CarWashingProgramBuilder builder) {
        return builder.addPreWash()
                .addMainWash()
                .addDiscWashing()
                .addRinsing()
                .addDrying()
                .addPolishing()
                .addWaxing()
                .build();

    }

}
