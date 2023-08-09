package patterns.behavioral.templatemethod.projectbuilder;

public abstract class ProjectBuilder {
    public void build() {
        clean();
        validate();
        compile();
        test();
        deploy();
    }
    private void clean() {
        System.out.println("Removing previous build files...");
    }
    public void deploy() {
        System.out.println("Deploying project...");
    }
    public abstract void validate();
    public abstract void compile();
    public abstract void test();


}
