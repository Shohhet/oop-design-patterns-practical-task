package patterns.behavioral.templatemethod.projectbuilder;

public class JavaProjectBuilder extends ProjectBuilder {
    @Override
    public void validate() {
        System.out.println("Validating Java project...");
    }

    @Override
    public void compile() {
        System.out.println("Compiling Java project...");
    }

    @Override
    public void test() {
        System.out.println("Run tests for Java Project");
    }

}
