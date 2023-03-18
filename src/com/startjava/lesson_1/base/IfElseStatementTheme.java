package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Задание 1. Перевод псевдокода на язык Java \n");
        int age = 22;
        char firstLetterName = "Ivan".charAt(0);
        float length = 2.10f;
        boolean male = true;
        if(age > 20) {
            System.out.println("Возраст старше двадцати лет");
        } else {
            System.out.println("Возраст младше двадцати лет");
        }
        if(!male) {
            System.out.println("Пол женский");
        } else {
            System.out.println("Пол мужской");
        }
        if(length < 1.80) {
            System.out.println("Рост ниже 1 метра 80 см");
        } else {
            System.out.println("Рост выше 1 метра 80 см");
        }
        if(firstLetterName == 'M') {
            System.out.println("Первая буква имени М");
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква имени И");
        } else {
            System.out.println("Первая буква имени не М и не И");
        }

        System.out.println("\nЗадание 2. Поиск max и min числа \n");
        int num1 = 256;
        int num2 = 154;
        if(num1 > num2) {
            System.out.println("Число " + num1 + " максимальное, число " + num2 + " минимальное");
        } else if(num1 == num2) {
            System.out.println("Число " + num1 + " равно числу " + num2);
        } else {
            System.out.println("Число " + num2 + " максимальное, число " + num1 + " минимальное");
        }

        System.out.println("\nЗадание 3. Проверка числа \n");
        System.out.print("Исходное число " + num1 + " является ");
        if(num1 == 0) {
            System.out.println("нулем");
        } else {
            if((num1 % 2) == 0) {
                System.out.print("четным и ");
            } else {
                System.out.print("нечетным и ");
            } 
            if(num1 > 0) {
                System.out.println("положительным");
            } else {
                System.out.println("отрицательным");
            }
        }

        System.out.println("\nЗадание 4. Поиск одинаковых цифр в числах \n");
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        int tens1 = num1 % 100 / 10;
        int tens2 = num2 % 100 / 10;
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        System.out.println("Исходные сравниваемые числа " + num1 + " и " + num2);
        if(ones1 == ones2) {
            System.out.println("В разряде единиц одинаковая цифра " + ones1);
        }
        if(tens1 == tens2) {
            System.out.println("В разряде десяток одинаковая цифра " + tens1);
        }
        if(hundreds1 == hundreds2) {
            System.out.println("В разряде сотен одинаковая цифра " + hundreds1);
        }
        else if(ones1 != ones2 && tens1 != tens2 && hundreds1 != hundreds2) {
            System.out.println("Одинаковых цифр в разрядах сравниваемых чисел нет");
        }

        System.out.println("\nЗадание 5. Определение символа по его коду \n");
        char symbol = '\u0057';
        System.out.println("Код символа ASCII-таблицы Dec " + (int) symbol + " - " + symbol);
        if(symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " маленькая буква");
        } else if(symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " большая буква");
        } else if(symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " число");
        } else {
            System.out.println(symbol + " не буква и не число");
        }

        System.out.println("\nЗадание 6. Подсчет суммы вклада и начисленных банком % \n");
        int deposit = 300_000;
        float rateDeposit = 0.05f;
        if(deposit >= 100_00 && deposit <= 300_000) {
            rateDeposit = 0.07f;
        } else if(deposit > 300_000) {
            rateDeposit = 0.10f;
        }
        System.out.println("Сумма вклада - " + deposit + " руб.");
        System.out.println("Начисленная сумма % - " + (deposit * rateDeposit) + " руб.");
        System.out.println("Итоговая сумма с %  - " + (deposit + deposit * rateDeposit) + " руб.");

        System.out.println("\nЗадание 7. Определение оценки по предметам \n");
        int historyScore = 59;
        int programmingScore = 91;
        int mark1 = 2, mark2 = 2;
        if(historyScore > 60 && historyScore <= 73) {
            mark1 = 3;
        } else if(historyScore > 73 && historyScore <= 91) {
            mark1 = 4;
        } else if(historyScore > 91) {
            mark1 = 5;
        }
        if(programmingScore > 60 && programmingScore <= 73) {
            mark2 = 3;
        } else if(programmingScore > 73 && programmingScore <= 91) {
            mark2 = 4;
        } else if(programmingScore > 91) {
            mark2 = 5;
        }
        System.out.println(mark1  + " - оценка по предмету История");
        System.out.println(mark2  + " - оценка по предмету Программирование");
        System.out.println(((mark1 + mark2) / 2) + " - средний балл оценок по предметам");
        System.out.println(((historyScore + programmingScore) / 2) + " - средний % по предметам");

        System.out.println("\nЗадание 8. Расчет прибыли за год \n");
        int rentMonth = 5_000;
        int salesMonth = 13_000;
        int primeCostMonth = 9_000;
        int profit = (salesMonth - rentMonth - primeCostMonth) * 12;
        if (profit > 0) {
            System.out.println("+" + profit + " - прибыль за год в рублях");
        } else {
            System.out.println(profit + " - убыток за год в рублях");
        }

        System.out.println("\nЗадание 9. Подсчет количества банкнот \n");
        int sumUsd = 567;
        int nom1 = 1, nom10 = 10, nom100 = 100;
        int ones = sumUsd % 10;
        int tens = sumUsd % 100 / 10;
        int hundreds = sumUsd / 100;
        int numberNomUsd1 = 50;
        int numberNomUsd10 = 5;
        int numberNomUsd100 = 10;
        if(hundreds < numberNomUsd100) {
            hundreds = sumUsd / 100;
        } else {
            hundreds = numberNomUsd100;
        }
        if((sumUsd - 100 * hundreds) /10 < numberNomUsd10) {
            tens = (sumUsd - 100 * hundreds) / 10;
        } else {
            tens = numberNomUsd10;
        }
        if((sumUsd - 100 * hundreds - 10 * tens) < numberNomUsd1) {
            ones = (sumUsd - 100 * hundreds - 10 * tens);
        } else {
            System.out.println("не хватает банкнот номиналом 1USD");
        }
        System.out.println((nom100 + ", " + nom10 + ", " + nom1) + " - номиналы банкнот USD");
        System.out.println(hundreds + " - требуемое количество банкнот номиналом 100 USD");
        System.out.println(tens + " - требуемое количество банкнот номиналом 10 USD");
        System.out.println(ones + " - требуемое количество банкнот номиналом 1 USD");
        System.out.println((hundreds * nom100 + tens * nom10 + ones) + " - выдаваемая общая сумма USD");
    }
}