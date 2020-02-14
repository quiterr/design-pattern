package com.quiterr.prototype;

/**
 * @author huangchen
 * @date 2020/2/14
 */
public class People implements Cloneable{
    private String name;
    private Integer age;

    public People(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
