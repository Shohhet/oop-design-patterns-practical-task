package patterns.behavioral.interpreter.expression;

import patterns.behavioral.interpreter.Interpreter;

public abstract class Expression {
    protected double meters;

    public Expression(double meters) {
        this.meters = meters;
    }

    public abstract double interpret(Interpreter interpreter);
}
