package com.alibaba.generic;

import java.sql.Array;
import java.util.ArrayList;

/**
 * 项目名：    chapter15
 * 文件名：    Generic01
 * 创建时间：   2022/9/2 10:50
 *
 * @author crazy Chen
 * 描述：     引出泛型
 * 不能对加入到集合ArrayList中的数据类型进行约束（不安全）
 * 遍历的时候，需要进行类型转换，如果集合中的数据量较大，对效率有影响。
 * TODO
 */
public class Generic01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Dog("旺财",10));
        list.add(new Dog("发财",3));
        list.add(new Dog("小虎",5));
        //假如不小心加了一只猫
        //list.add(new Cat("小花",1));
        for (Object o :list) {
            Dog dog = (Dog) o;
            System.out.println(dog.getAge()+dog.getName());
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