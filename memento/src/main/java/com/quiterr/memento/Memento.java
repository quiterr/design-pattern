package com.quiterr.memento;

/**
 * 备忘录
 *
 * @author huangchen
 * @date 2019/11/4
 */
public class Memento {

    private String state;

    Memento(String state)
    {
        this.state=state;
    }

    public void setState(String state)
    {
        this.state=state;
    }

    String getState()
    {
        return state;
    }

}
