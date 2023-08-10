package patterns.behavioral.interpreter.expression;

import patterns.behavioral.interpreter.Interpreter;

public class MetersToFeetExpression extends Expression {
    public MetersToFeetExpression(double meters) {
        super(meters);
    }

    @Override
    public double interpret(Interpreter interpreter) {
        return interpreter.getFeet(this.meters);
    }
}
