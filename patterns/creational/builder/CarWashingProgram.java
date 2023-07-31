package patterns.creational.builder;

public class CarWashingProgram {
    private final String preWash;
    private final String mainWash;
    private final String discWashing;
    private final String rinsing;
    private final String waxing;

    private final String polishing;

    private final String drying;

    public CarWashingProgram(CarWashingProgramBuilder builder) {
        this.preWash = builder.getPreWash();
        this.mainWash = builder.getMainWash();
        this.discWashing = builder.getDiscWashing();
        this.rinsing = builder.getRinsing();
        this.waxing = builder.getWaxing();
        this.polishing = builder.getPolishing();
        this.drying = builder.getDrying();
    }

    public void execute() {
        if (preWash != null) {
            System.out.println(preWash);
        }
        if (mainWash != null) {
            System.out.println(mainWash);
        }
        if (discWashing != null) {
            System.out.println(discWashing);
        }
        if (rinsing != null) {
            System.out.println(rinsing);
        }
        if (waxing != null) {
            System.out.println(rinsing);
        }
        if (polishing != null) {
            System.out.println(polishing);
        }
        if (drying != null) {
            System.out.println(drying);
        }

    }

}
