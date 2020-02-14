package com.quiterr.mediator;

/**
 * @author huangchen
 * @date 2019/11/1
 */
public class App {
    public static void main(String[] args)
    {
        //房产中介
        Medium md=new EstateMedium();
        AbstractCustomer member1,member2;
        member1 = new Seller("张三(卖方)");
        member2 = new Buyer("李四(买方)");
        //客户注册
        md.register(member1);
        md.register(member2);

        member1.send("我有一套房子");
        member2.send("是两室一厅吗");
    }
}
