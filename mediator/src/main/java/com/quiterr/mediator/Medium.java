package com.quiterr.mediator;

/**
 * @author huangchen
 * @date 2019/11/1
 */
public interface Medium {
    void register(AbstractCustomer member); //客户注册
    void relay(String from,String ad); //转发
}
