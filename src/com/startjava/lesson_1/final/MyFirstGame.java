package com.startjava.lesson_1.final_;

public class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("Игра Угадай число \n");
        int hiddenNum = 16;
        int max = 100;
        int min = 1;
        while(min <= max) {
            int mid = (min + max) / 2;
            if(hiddenNum < mid) {
                System.out.println("Число " + mid + " больше того, что загадал компьютер");
                max = mid - 1;
            } else if(hiddenNum > mid) {
                System.out.println("Число " + mid + " меньше того, что загадал компьютер");
                min = mid + 1;
            } else if(hiddenNum == mid) {
                System.out.println("Загаданное число " + hiddenNum + ". Вы победили!");
                min = max + 1;
            }
        }
    }
}