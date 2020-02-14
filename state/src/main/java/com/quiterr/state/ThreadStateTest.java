package com.quiterr.state;


/**
 * @author huangchen
 * @date 2019/10/29
 */
public class ThreadStateTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
        t.start();
        ThreadContext context=new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
