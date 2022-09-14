package com.alibaba.generic.improve;

import java.util.ArrayList;

/**
 * 项目名：    chapter15
 * 文件名：    Generic02
 * 创建时间：   2022/9/2 11:03
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Generic02 {
    public static void main(String[] args) {
        //当这样写，表示ArrayList里面只能存储Dog类型或其子类型
        ArrayList<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("旺财",10));
        list.add(new Dog("发财",3));
        list.add(new Dog("小虎",5));
        //假如不小心加了一只猫
        //list.add(new Cat("小花",1));
        System.out.println("++++使用泛型+++");
        for (Dog dog :list) {
            System.out.println(dog.getAge()+" "+dog.getName());
        }

    }
}
class Dog{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Cat{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}