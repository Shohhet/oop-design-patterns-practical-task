package patterns.behavioral.templatemethod;

import patterns.behavioral.templatemethod.projectbuilder.JavaProjectBuilder;
import patterns.behavioral.templatemethod.projectbuilder.KotlinProjectBuilder;
import patterns.behavioral.templatemethod.projectbuilder.ProjectBuilder;

public class TemplateMethodRunner {
    public static void main(String[] args) {
        ProjectBuilder javaProjectBuilder = new JavaProjectBuilder();
        ProjectBuilder kotlinProjectBuilder = new KotlinProjectBuilder();

        javaProjectBuilder.build();
        System.out.println("==============================");
        kotlinProjectBuilder.build();


    }
}
