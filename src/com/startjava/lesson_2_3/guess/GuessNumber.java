package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void guessNumber() {
        System.out.println("Загадывается число");
        int hiddenNum = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Ход игрока " + player1.getName() + ". Введите число: ");
            int guessNumber = scanner.nextInt();
            if(guessNumber == hiddenNum) {
                System.out.println("Загаданное число " + hiddenNum + ". Вы победили!");
                break;
            }
            if(guessNumber > hiddenNum) {
                System.out.println("Число " + guessNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + guessNumber + " меньше того, что загадал компьютер");
            }

            System.out.println("Ход игрока " + player2.getName() + ". Введите число: ");
            guessNumber = scanner.nextInt();
            if(guessNumber == hiddenNum) {
                System.out.println("Загаданное число " + hiddenNum + ". Вы победили!");
                break;
            }
            if(guessNumber > hiddenNum) {
                System.out.println("Число " + guessNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + guessNumber + " меньше того, что загадал компьютер");
            }
        }
    }
}