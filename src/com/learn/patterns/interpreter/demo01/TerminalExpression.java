package com.learn.patterns.interpreter.demo01;

/**
 * @author lijy
 * @date 2019-12-06
 * @description
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    void Interpret(Context context) {
        String before = context.getBefore();
        context.setAfter("被终端处理后：" + before);
        System.out.println(context.getAfter());
    }
}
