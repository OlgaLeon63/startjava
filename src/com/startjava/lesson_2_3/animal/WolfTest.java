package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("male");
        wolfOne.setNickname("Mike");
        wolfOne.setWeight(1.6f);
        wolfOne.setAge(10);
        wolfOne.setColor("grey");
        System.out.println("gender = " + wolfOne.getGender());
        System.out.println("nickname = " + wolfOne.getNickname());
        System.out.println("weight = " + wolfOne.getWeight());
        System.out.println("age = " + wolfOne.getAge());
        System.out.println("color = " + wolfOne.getColor());
        System.out.println(wolfOne.move());
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.run());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}