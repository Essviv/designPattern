package com.cmcc.syw.interpreter;

/**
 * Created by sunyiwei on 16-1-8.
 */
public class Main {
    public static void main(String[] args) {
        IContext context = buildContext();

        Interpreter interpreter = new FirstInterpreter();
        interpreter.interpret(context);

        interpreter = new SecondInterpreter();
        interpreter.interpret(context);
    }

    private static IContext buildContext() {
        return new IContext<String>() {
            public String getFirstOperation() {
                return "sunyiwei";
            }

            public String getSecondOperation() {
                return "patrick";
            }
        };
    }
}
