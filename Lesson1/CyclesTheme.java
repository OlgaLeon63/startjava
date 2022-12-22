public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("Задание 1. Подсчет суммы четных и нечетных чисел \n");
        int counter = -10;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        do {
            if((counter % 2) == 0) {
                sumEvenNum += counter;
            } else {
                sumOddNum += counter;
            }
            counter++;
        } while(counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEvenNum + 
                ", а нечетных = " + sumOddNum);

        System.out.println("\nЗадание 2. Вывод чисел в интервале (min и max) в порядке убывания \n");
        int num1 = 10;
        int num2 = 2;
        int num3 = -1;
        int min = num2;
        int max = num1;
        if(num1 <= num2) {
            max = num2;
            min = num1;
        } 
        if(min >= num3) {
            min = num3;
        }
        if(max <= num3) {
            max = num3;
        }
        for(int i = (max - 1); i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадание 3. Вывод реверсивного числа и суммы его цифр \n");
        int num = 1234;
        int sum = 0;
        System.out.print("Исходное число в обратном порядке ");
        while(num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            sum += digit;
            num /= 10;
        }
        System.out.println("\nСумма цифр числа " + sum);

        System.out.println("\nЗадание 4. Вывод чисел на консоль в несколько строк \n");
        for(int i = 1; i < 24; i += 2) {
            for(int column = 0; column < 5; column++) {
                if(i < 24) {
                    System.out.printf("%3d", i);
                } else {
                    System.out.printf("%3d", 0);
                }
                i += 2;
            }
            i -= 2;
            System.out.println();
        }

        System.out.println("\nЗадание 5. Проверка количества двоек на четность/нечетность \n");
        num = 3242592;
        int copyNum = num;
        int numOfTwos = 0;
        while(copyNum > 0) {
            if(copyNum % 10 == 2) {
                numOfTwos++;
            }
            copyNum /= 10;
        }
        System.out.println("Число " + num + " содержит " + (numOfTwos / 2 == 0 ? " четное" : " нечетное") + 
                " количество двоек");

        System.out.println("\nЗадание 6. Отображение фигур в консоли \n");
        int row;
        int col = 1;
        for(row = 1; row <= 5; row++) {
            for(col = 1; col <= 10; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        while(row <= 6 && row != 1) {
            col = 1;
            while(col <= row - 1) {
                System.out.print("#");
                col++;
            }
            System.out.println();
            row--;
        }

        do {
            do {
                System.out.print("$");
                col++;
            } while(col <= (row <= 3 ? row : 5 - row + 1)); 
            row++;
            col = 1;
            System.out.println();
        } while(row <= 5);

        System.out.println("\nЗадание 7. Отображение ASCII-символов \n");
        System.out.printf("%5s%5s%n", "Dec", "Char");
        for(int i = 1; i <= 47; i += 2) {
            System.out.printf("%5d%5c%n", i, i);
        }
        for(int i = 98; i <= 122; i += 2) {
            System.out.printf("%5d%5c%n", i, i);
        }

        System.out.println("\nЗадание 8. Проверка, является ли число палиндромом \n");
        num = 1234321;
        copyNum = num;
        int reverseNum;
        for(reverseNum = 0; copyNum > 0; copyNum /= 10) {
            reverseNum = reverseNum * 10 + copyNum % 10;
        }
        if(num == reverseNum) {
            System.out.println("Число " + num + " является палиндромом");
        } else {
            System.out.println("нет");
        }

        System.out.println("\nЗадание 9. Определение, является ли число счастливым \n");
        num = 832562;
        copyNum = num;
        int sumAbc = 0, sumDef, j = 0;
        for(sumDef = 0; copyNum > 0; copyNum /= 10) {
            j++;
            if(j <= 3) {
                sumDef = sumDef + copyNum % 10;
            } else {
                sumAbc = sumAbc + copyNum % 10;
            }
        }
        System.out.println("Сумма цифр abc = " + sumAbc + " Сумма цифр def = " + sumDef);
        if(sumAbc == sumDef) {
            System.out.println("Число " + num + " является счастливым");
        } else {
            System.out.println("Число " + num + " не является счастливым");
        }

        System.out.println("\nЗадание 10.  Вывод таблицы умножения Пифагора \n");
        for(row = 1; row <= 9; row++) {
            if(row == 1) {
                System.out.printf("%3s |", "   ");
            } else {
                System.out.printf("%3d |", row);
            }
            for(col = 2 * row; col <= 9 * row; col += row) {
                System.out.printf("%3d", col);
            }
            if(row == 1) {
                System.out.printf("%n%29s%n", "_____________________________");
            } else {
            System.out.println();
            }
        }
    }
}