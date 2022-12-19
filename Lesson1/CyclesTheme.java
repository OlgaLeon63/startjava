public class CyclesTheme {

    public static void main(String[] args) {

        System.out.println("Задание 1. Подсчет суммы четных и нечетных чисел \n");
        int num = -10, x = 0, y = 0;
        do {
            if((num % 2) == 0) {
                x += num;
            } else {
                y += num;
            }
            num++;
        } while(num <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + x + ", а нечетных = " + y);

        System.out.println("\nЗадание 2. Вывод чисел в интервале (min и max) в порядке убывания \n");
        int num1 = 10, num2 = 5, num3 = -1, min, max;
        if(num1 >= num2 && num1 >= num3) {
            max = num1;
            if(num2 >= num3) {
                min = num3;
            } else {
                min = num2;
            }
        } else if(num2 >= num1 && num2 >= num3) {
            max = num2;
            if(num1 >= num3) {
                min = num3;
            } else {
                min = num1;
            }
        } else {
            max = num3;
            if(num2 >= num1) {
                min = num1;
            } else {
                min = num2;
            }
        }
        for(int i = (max - 1); i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадание 3. Вывод реверсивного числа и суммы его цифр \n");
        int reverseNum = 1234, inverseNum, sum = 0;
        System.out.print("Исходное число в обратном порядке ");
        while(reverseNum != 0) {
            inverseNum = reverseNum % 10;
            System.out.print(inverseNum);
            sum += (reverseNum % 10);
            reverseNum /= 10;
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
        int numX = 3242592;
        x = numX;
        int n = 0;
        while(x > 0) {
            if(x % 10 == 2) {
                n++;
            }
            x /= 10;
        }
        System.out.println("Число " + numX + " содержит " + (n / 2 == 0 ? " четное" : " нечетное") + 
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
        int i;
        System.out.printf("%5s%5s%n", "Dec", "Char");
        for(i = 1; i <= 47; i += 2) {
            System.out.printf("%5d%5c%n", i, i);
        }
        for(i = 98; i <= 122; i += 2) {
            System.out.printf("%5d%5c%n", i, i);
        }

        System.out.println("\nЗадание 8. Проверка, является ли число палиндромом \n");
        numX = 1234321;
        x = numX;
        for(inverseNum = 0; x != 0; x /= 10) {
            inverseNum = inverseNum * 10 + x % 10;
        }
        if(numX == inverseNum) {
            System.out.println("Число " + numX + " является палиндромом");
        } else {
            System.out.println("нет");
        }

        System.out.println("\nЗадание 9. Определение, является ли число счастливым \n");
        numX = 832562;
        x = numX;
        int sumAbc = 0, sumDef, j = 0;
        for(sumDef = 0; x != 0; x /= 10) {
            j ++;
            if(j <= 3) {
                sumDef = sumDef + x % 10;
            } else {
                sumAbc = sumAbc + x % 10;
            }
        }
        System.out.println("Сумма цифр abc = " + sumAbc + " Сумма цифр def = " + sumDef);
        if(sumAbc == sumDef) {
            System.out.println("Число " + numX + " является счастливым");
        } else {
            System.out.println("Число " + numX + " не является счастливым");
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