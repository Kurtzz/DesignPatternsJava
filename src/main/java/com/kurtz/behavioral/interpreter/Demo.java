package com.kurtz.behavioral.interpreter;

public class Demo {
    public static void main(String[] args) {
//        String context = "Lions";
//        String context = "Tigers";
//        String context = "Bears";
//        String context = "Lions Tigers";
        String context = "Lions Bears";
//        String context = "Tigers Bears";

        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }

    private static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        //Tigers && Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        //Lions || (Tigers && Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        //Bears && (Lions || (Tigers && Bears))
        return new AndExpression(terminal3, alternation2);
    }
}
