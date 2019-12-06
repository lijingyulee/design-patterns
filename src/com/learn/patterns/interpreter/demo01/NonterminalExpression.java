package com.learn.patterns.interpreter.demo01;

/**
 * @author lijy
 * @date 2019-12-06
 * @description
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    void Interpret(Context context) {
        String before = context.getBefore();
        context.setAfter("被非终端处理后：" + before);
        System.out.println(context.getAfter());
    }
}
