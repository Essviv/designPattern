package com.cmcc.syw.interpreter;

/**
 * Created by sunyiwei on 16-1-8.
 */
public class SecondInterpreter implements Interpreter {
    public void interpret(IContext context) {
        System.out.println(">>>>>>>>>>>");
        System.out.println(">>>" + context.getFirstOperation() +">>>");
        System.out.println(">>>" + context.getSecondOperation() +">>>");
        System.out.println(">>>>>>>>>>>");
    }
}
