package com.quiterr.interpreter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 终结符的表达式
 *
 * @author huangchen
 * @date 2019/11/4
 */
class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<>();

    TerminalExpression(String[] data) {
        Collections.addAll(set, data);
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
