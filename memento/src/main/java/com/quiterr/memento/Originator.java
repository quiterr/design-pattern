package com.quiterr.memento;

/**
 * 发起者
 *
 * @author huangchen
 * @date 2019/11/4
 */
class Originator {
    private String state;

    void setState(String state) {
        this.state = state;
    }

    String getState() {
        return state;
    }

    Memento createMemento() {
        return new Memento(state);
    }

    void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
