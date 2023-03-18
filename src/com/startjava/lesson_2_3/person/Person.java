package com.startjava.lesson_2_3.person;

public class Person {

    String gender = "female";
    String name = "Lana";
    float height = 1.7f;
    float weight = 70.3f;
    short age = 38;

    void move() {
        System.out.println(name + " идет");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    String speak() {
        return "говорит";
    }

    boolean learnJava() {
        System.out.println(name + " изучает Java");
        return true;
    }
}