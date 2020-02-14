package com.quiterr.prototype;

/**
 * @author huangchen
 * @date 2020/2/14
 */
public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        People p1 = new People("张三", 20);
        People p2 = (People) p1.clone();
        System.out.println(p2);
    }
}
