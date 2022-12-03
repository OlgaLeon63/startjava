public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Задание 1. Перевод псевдокода на язык Java \n");
        int age = 22;
        char firstLetterName;
        float length = 2.10f;
        boolean male = true;
        if(age > 20) {
            System.out.println("Возраст старше двадцати лет");
        } else {
            System.out.println("Возраст младше двадцати лет");
        }
        if(! male) {
            System.out.println("Пол женский");
        } else {
            System.out.println("Пол мужской");
        }
        if(length < 1.80) {
            System.out.println("Рост ниже 1 метра 80 см");
        } else {
            System.out.println("Рост выше 1 метра 80 см");
        }
        firstLetterName = "Ivan".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Первая буква имени М");
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква имени И \n");
        } else {
            System.out.println("Первая буква имени не М и не И \n");
        }

        System.out.println("Задание 2. Поиск max и min числа \n");
        int num1 = 256;
        int num2 = 154;
        if(num1 > num2) {
            System.out.println("Число " + num1 + " максимальное, число " + num2 + 
                " минимальное \n");
        } else if(num1 == num2) {
            System.out.println("Число " + num1 + " равно числу " + num2 + '\n');
        }
        else {
            System.out.println("Число " + num2 + " максимальное, число " + num1 + 
                " минимальное \n");
        }

        System.out.println("Задание 3. Проверка числа \n");
        System.out.println("Исходное число " + num1);
        if(num1 == 0) {
        } else {
            if((num1 % 2) == 0) {
                System.out.println("Число " + num1 + " является четным");
            } else {
                System.out.println("Число " + num1 + " является нечетным");
            } 
            if(num1 > 0) {
                System.out.println("Число " + num1 + " является положительным \n");
            } else {
                System.out.println("Число " + num1 + " является отрицательным \n");
            }
        }

        System.out.println("Задание 4. Поиск одинаковых цифр в числах \n");
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        int tens1 = num1 % 100 / 10;
        int tens2 = num2 % 100 / 10;
        int hund1 = num1 / 100;
        int hund2 = num2 / 100;
        System.out.println("Исходные сравниваемые числа " + num1 + " и " + num2);
        if(ones1 == ones2) {
            System.out.println("В разряде единиц одинаковая цифра " + ones1 + '\n');
        }
        if(tens1 == tens2) {
            System.out.println("В разряде десяток одинаковая цифра " + tens1 + '\n');
        }
        if(hund1 == hund2) {
            System.out.println("В разряде сотен одинаковая цифра " + hund1 + '\n');
        }
        else if(ones1 != ones2 && tens1 != tens2 && hund1 != hund2) {
            System.out.println("Одинаковых цифр в разрядах сравниваемых чисел нет \n");
        }

        System.out.println("Задание 5. Определение символа по его коду \n");
        char var = '\u0057';
        int asciiU57 = var;
        System.out.println("Код символа ASCII-таблицы Dec " + asciiU57 + " - " + var);
        if(var >= 'a' && var <= 'z') {
            System.out.println(var + " маленькая буква \n");
        } else if(var >= 'A' && var <= 'Z') {
            System.out.println(var + " большая буква \n");
        } else if(var >= '0' && var <= '9') {
            System.out.println(var + " число \n");
        } else {
            System.out.println(var + " не буква и не число \n");
        }

        System.out.println("Задание 6. Подсчет суммы вклада и начисленных банком % \n");
        int deposit = 300_000;
        float rateDeposit;
        if(deposit < 100_000) {
            rateDeposit = 0.05f;
        } else if(deposit >= 100_00 && deposit <= 300_000) {
            rateDeposit = 0.07f;
        } else {
            rateDeposit = 0.10f;
        }
        System.out.println("Сумма вклада - " + deposit + " руб.");
        System.out.println("Начисленная сумма % - " + (deposit * rateDeposit) + " руб.");
        System.out.println("Итоговая сумма с %  - " + (deposit + deposit * rateDeposit) + 
            " руб. \n");

        System.out.println("Задание 7. Определение оценки по предметам \n");
        int historyScore = 59;
        int programmingScore = 91;
        int mark1, mark2;
        if(historyScore <= 60) {
            mark1 = 2;
        } else if(historyScore > 60 && historyScore <= 73) {
            mark1 = 3;
        } else if(historyScore > 73 && historyScore <= 91) {
            mark1 = 4;
        } else {
            mark1 = 5;
        }
        if(programmingScore <= 60) {
            mark2 = 2;
        } else if(programmingScore > 60 && programmingScore <= 73) {
            mark2 = 3;
        } else if(programmingScore > 73 && programmingScore <= 91) {
            mark2 = 4;
        } else {
            mark2 = 5;
        }
        System.out.println(mark1  + " - оценка по предмету История");
        System.out.println(mark2  + " - оценка по предмету Программирование");
        System.out.println(((mark1 + mark2) / 2) + " - средний балл оценок по предметам");
        System.out.println(((historyScore + programmingScore) / 2) + 
            " - средний % по предметам \n");

        System.out.println("Задание 8. Расчет прибыли за год \n");
        int rentMonth = 5_000;
        int salesMonth = 13_000;
        int primeCostMonth = 9_000;
        int profit;
        profit = (salesMonth - rentMonth - primeCostMonth) * 12;
        if (profit > 0) {
            System.out.println(+profit + " - прибыль за год в рублях \n");
        } else {
            System.out.println(profit + " - убыток за год в рублях \n");
        }

        System.out.println("Задание 9. Подсчет количества банкнот \n");
        int sumUSD = 567;
        int nom1 = 1, nom10 = 10, nom100 = 100;
        int ones = sumUSD % 10;
        int tens = sumUSD % 100 / 10;
        int hund = sumUSD / 100;
        if(hund < 10) {
            hund = sumUSD / 100;
        } else {
            hund = 10;
        }
        if((sumUSD - 100 * hund) /10 < 5) {
            tens = (sumUSD - 100 * hund) / 10;
        } else {
            tens = 5;
        }
        if((sumUSD - 100 * hund - 10 * tens) < 50) {
            ones = (sumUSD - 100 * hund - 10 * tens);
        } else {
            System.out.println("не хватает банкнот номиналом 1USD");
        }
        System.out.println((nom100 + ", " + nom10 + ", " + nom1) + " - номиналы банкнот USD");
        System.out.println(hund + " - требуемое количество банкнот номиналом 100 USD");
        System.out.println(tens + " - требуемое количество банкнот номиналом 10 USD");
        System.out.println(ones + " - требуемое количество банкнот номиналом 1 USD");
        System.out.println((hund * nom100 + tens * nom10 + ones) + " - выдаваемая общая сумма USD");
    }
}