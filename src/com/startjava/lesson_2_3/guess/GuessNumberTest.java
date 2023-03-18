package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра Угадай число \n");
        System.out.println("Введите имя первого игрока:");
        String name = scanner.nextLine();
        Player player1 = new Player(name);
        System.out.println("Введите имя второго игрока:");
        name = scanner.nextLine();
        Player player2 = new Player(name);

        GuessNumber game = new GuessNumber(player1, player2); 
        String choice = "yes";
        do {
            game.guessNumber();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                choice = scanner.nextLine();
            } while(!choice.equals("yes") && !choice.equals("no"));
        } while(choice.equals("yes"));
        scanner.close();
    }
}