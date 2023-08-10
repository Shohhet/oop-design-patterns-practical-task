package patterns.behavioral.interpreter;

public class Interpreter {
    public double getYards(double meters) {
        return meters * 1.094;
    }

    public double getFeet(double meters) {
        return meters * 3.281;
    }
}
