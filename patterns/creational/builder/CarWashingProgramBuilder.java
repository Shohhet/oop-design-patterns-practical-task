package patterns.creational.builder;

public class CarWashingProgramBuilder {
    private String preWash;
    private String mainWash;
    private String discWashing;
    private String rinsing;
    private String waxing;
    private String polishing;
    private String drying;

    public String getPreWash() {
        return preWash;
    }

    public String getMainWash() {
        return mainWash;
    }

    public String getDiscWashing() {
        return discWashing;
    }

    public String getRinsing() {
        return rinsing;
    }

    public String getWaxing() {
        return waxing;
    }

    public String getPolishing() {
        return polishing;
    }

    public String getDrying() {
        return drying;
    }

    public CarWashingProgramBuilder  addPreWash() {
        preWash = "Removing dirt...";
        return this;
    }
    public CarWashingProgramBuilder addMainWash() {
        mainWash = "Covering with foam ...";
        return this;
    }
    public CarWashingProgramBuilder addDiscWashing() {
        discWashing = "Cleaning wheels disks";
        return this;
    }
    public CarWashingProgramBuilder addRinsing() {
        rinsing = "Rinsing... ";
        return this;
    }
    public CarWashingProgramBuilder addWaxing() {
        waxing = "Waxing...";
        return this;
    }
    public CarWashingProgramBuilder addPolishing() {
        polishing = "Polishing...";
        return this;
    }
    public CarWashingProgramBuilder addDrying() {
        drying = "Drying...";
        return this;
    }
    public CarWashingProgram build() {
        return new CarWashingProgram(this);
    }
}
