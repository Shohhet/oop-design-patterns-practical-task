package patterns.behavioral.interpreter.expression;

import patterns.behavioral.interpreter.Interpreter;

public class MetersToYardsExpression extends Expression {

    public MetersToYardsExpression(double meters) {
        super(meters);
    }

    @Override
    public double interpret(Interpreter interpreter) {
        return interpreter.getYards(this.meters);
    }
}
