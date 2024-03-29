package com.startjava.lesson_2_3.animal;

public class Wolf {

    private String gender;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean move() {
        System.out.println(nickname + " идет");
        return true;
    }

    public boolean sit() {
        System.out.println(nickname + " сидит");
        return true;
    }

    public boolean run() {
        System.out.println(nickname + " бежит");
        return true;
    }

    public boolean howl() {
        System.out.println(nickname + " воет");
        return true;
    }

    public boolean hunt() {
        System.out.println(nickname + " охотится");
        return true;
    }
}