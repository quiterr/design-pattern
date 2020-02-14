package com.quiterr.interpreter;

/**
 * 非终结符表达式类
 *
 * @author huangchen
 * @date 2019/11/4
 */
class AndExpression implements Expression {
    private Expression city;
    private Expression person;

    AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] s = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
