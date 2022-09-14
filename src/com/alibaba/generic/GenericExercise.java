package com.alibaba.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 项目名：    chapter15
 * 文件名：    GenericExercise
 * 创建时间：   2022/9/2 13:41
 *
 * @author crazy Chen
 * 描述：
 * 创建三个学生对象，要求放到key中是String，放到Value是学生对象
 * TODO
 */
public class GenericExercise {
    public static void main(String[] args) {
        HashMap<String, Student> studentHashMap = new HashMap<>(16);
        studentHashMap.put("小白", new Student("小白", 17));
        studentHashMap.put("小黑子", new Student("小黑子", 19));
        studentHashMap.put("大黄", new Student("大黄", 18));

        Set<String> strings = studentHashMap.keySet();
        for (String key : strings) {
            System.out.println(studentHashMap.get(key));
        }

        System.out.println("====================");
        Set<Map.Entry<String, Student>> entrySet = studentHashMap.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue());

        }


    }
}

class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}