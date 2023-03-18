package com.startjava.lesson_1.final_;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Калькулятор \n");
        int a = 3;
        int b = 3;
        int result = 1;
        char sign = '^';
        if(sign == '+') {
            result = a + b;
        } else if(sign == '-') {
            result = a - b;
        } else if(sign == '*') {
            result = a * b;
        } else if(sign == '/') {
            result = a / b;
        } else if(sign == '%') {
            result = a % b;
        } else if(sign == '^') {
            for(int i = 1; i <= b; i++) {
                result *= a;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}