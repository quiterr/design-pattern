package com.quiterr.mediator;

/**
 * @author huangchen
 * @date 2019/11/1
 */
abstract class AbstractCustomer {
    Medium medium;
    String name;

    AbstractCustomer(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setMedium(Medium medium) {
        this.medium = medium;
    }

    public abstract void send(String ad);

    public abstract void receive(String from, String ad);
}
