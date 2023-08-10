package patterns.behavioral.interpreter;


import patterns.behavioral.interpreter.expression.Expression;
import patterns.behavioral.interpreter.expression.MetersToFeetExpression;
import patterns.behavioral.interpreter.expression.MetersToYardsExpression;

public class InterpreterRunner {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        String input1 = "10 meters to feet";
        String input2 = "11.1 meters to yards";

        double result = InterpreterRunner.parse(input1).interpret(interpreter);
        System.out.printf("%s = %.2f", input1, result);
        System.out.println();
        result = InterpreterRunner.parse(input2).interpret(interpreter);
        System.out.printf("%s = %.2f", input2, result);
    }

    private static Expression parse(String input) {
        double meters = Double.parseDouble(input.substring(0, input.indexOf(" ")));
        if (input.contains("meters to yards")) {
            return new MetersToYardsExpression(meters);
        }
        if (input.contains("meters to feet")) {
            return new MetersToFeetExpression(meters);
        }
        throw new RuntimeException("Wrong expression format");
    }

}
