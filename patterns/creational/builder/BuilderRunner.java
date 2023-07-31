package patterns.creational.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        var builder = new CarWashingProgramBuilder()
                .addMainWash()
                .addRinsing()
                .addDrying()
                .addPolishing();
        var washProgram = new CarWashingProgram(builder);

        washProgram.execute();

        var ecoProgram = PresetsPrograms.getEcoWashProgram(new CarWashingProgramBuilder());
        ecoProgram.execute();
        System.out.println();
        var standardProgram = PresetsPrograms.getStandardWashProgram(new CarWashingProgramBuilder());
        standardProgram.execute();
        System.out.println();
        var fullProgram = PresetsPrograms.getFullWashProgram(new CarWashingProgramBuilder());
        fullProgram.execute();

    }
}
