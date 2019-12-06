package com.learn.patterns.interpreter.demo01;

/**
 * @author lijy
 * @date 2019-12-06
 * @description
 */
public class Interpreter01Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setBefore("test");

        TerminalExpression terminalExpression = new TerminalExpression();
        terminalExpression.Interpret(context);

        NonterminalExpression nonterminalExpression = new NonterminalExpression();
        nonterminalExpression.Interpret(context);

        /**
         * 被终端处理后：test
         * 被非终端处理后：test
         */

    }
}
