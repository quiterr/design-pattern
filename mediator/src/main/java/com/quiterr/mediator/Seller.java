package com.quiterr.mediator;

/**
 * @author huangchen
 * @date 2019/11/1
 */
public class Seller extends AbstractCustomer{

    Seller(String name)
    {
        super(name);
    }

    @Override
    public void send(String ad)
    {
        System.out.println(("我(卖方)说: "+ad+"\n"));
        medium.relay(name,ad);
    }

    @Override
    public void receive(String from, String ad)
    {
        System.out.println((from +"说: "+ad+"\n"));
    }
}
