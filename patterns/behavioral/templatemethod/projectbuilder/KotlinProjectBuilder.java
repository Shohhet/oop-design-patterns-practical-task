package patterns.behavioral.templatemethod.projectbuilder;

public class KotlinProjectBuilder extends ProjectBuilder {
    @Override
    public void validate() {
        System.out.println("Validating Kotlin project...");
    }

    @Override
    public void compile() {
        System.out.println("Compiling Kotlin project...");
    }

    @Override
    public void test() {
        System.out.println("Run tests for Kotlin Project");
    }

}
