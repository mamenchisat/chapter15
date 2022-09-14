package com.alibaba.generic;

/**
 * 项目名：    chapter15
 * 文件名：    Generic03
 * 创建时间：   2022/9/2 13:19
 *
 * @author crazy Chen
 * 描述：
 * 泛型的作用是：可以在类声明时通过一个标识标识类中某个属性的类型
 * 泛型可以保证如果程序在编译过程中没有发生警告，在运行时就不会产生类型转换异常
 * TODO
 */
public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("ant");
        person.t();
        Person<Integer> person1 = new Person<>(19);
        person1.t();

    }
}
class Person<E>{
    /**
     * E表示该。s的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间就确定了E是什么类型
     */
    E s;

    public Person(E s) {
        this.s = s;
    }
    public E f(){
        return s;
    }
    public void t(){
        System.out.println(s.getClass());
    }
}