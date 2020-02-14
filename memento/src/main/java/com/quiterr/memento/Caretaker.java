package com.quiterr.memento;

/**
 * 守护者
 *
 * @author huangchen
 * @date 2019/11/4
 */
class Caretaker {

    private Memento memento;

    void setMemento(Memento m)
    {
        memento=m;
    }

    Memento getMemento()
    {
        return memento;
    }
}
