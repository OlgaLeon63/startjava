public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println('\n' + "Задание 1. Вывод значений переменных на консоль \n");
        byte ram = 8;
        short windowsVer = 10;
        int hddSize = 500_000;
        long buildsOS = 19_045L;
        float processorBaseClock = 3.50f;
        double displayRate = 60.000;
        char cores = '4';
        boolean diskDriveActive = true;
        System.out.println(ram + " - оперативная память в Гб");
        System.out.println(windowsVer + " - версия системы windows");
        System.out.println(hddSize + " - размер жесткого диска в Гб");
        System.out.println(buildsOS + " - сборка ОС");
        System.out.println(processorBaseClock + " - базовая частота процессора в ГГц");
        System.out.println(displayRate + " - частота обновления в  Гц");
        System.out.println(cores + " - количество ядер");
        if(diskDriveActive) {
            System.out.println("Дисковод отсутствует \n");
        }

        System.out.println("Задание 2. Расчет стоимости товара со скидкой \n");
        int costPen = 100;
        int costBook = 200;
        int totalCost = costPen + costBook;
        float discount = 0.11f;
        System.out.println("сумма скидки 11% - " + (totalCost * discount) + " руб");
        System.out.println("общая стоимость товаров со скидкой 11% - " + (totalCost - totalCost * 
                discount) + " руб \n");

        System.out.println("Задание 3. Вывод слова JAVA \n");
        char smallA = 'a';
        char letterJ = 'J';
        char letterV = 'V';
        char smallV = 'v';
        System.out.println("   " + letterJ + "    " + smallA + "  " + smallV + "     " + smallV + 
                "  " + smallA);
        System.out.println("   " + letterJ + "   " + smallA + " " + smallA + "  " + smallV + 
                "   " + smallV + "  " + smallA + " " + smallA);
        System.out.println(letterJ + "  " + letterJ + "  " + smallA + smallA + smallA + smallA + 
                smallA + "  " + letterV + " " + letterV + "  " + smallA + smallA + smallA + 
                smallA + smallA);
        System.out.println(" " + letterJ + letterJ + "  " + smallA + "     " + smallA + "  " + 
                letterV + "  " + smallA + "     " + smallA + " \n");

        System.out.println("Задание 4. Вывод min и max значений целых числовых типов  \n");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Переменная byte \n" + "первоначальное значение - " + maxByte + '\n' + 
                "значение после инкремента - " + ++maxByte + '\n' + "значение после декремента - " 
                + --maxByte + '\n');
        System.out.println("Переменная short \n" + "первоначальное значение - " + maxShort + '\n' + 
                "значение после инкремента - " + ++maxShort + '\n' + "значение после декремента - "
                 + --maxShort + '\n');
        System.out.println("Переменная int \n" + "первоначальное значение - " + maxInt + '\n' + 
                "значение после инкремента - " + ++maxInt + '\n' + "значение после декремента - "
                 + --maxInt + '\n');
        System.out.println("Переменная long \n" + "первоначальное значение - " + maxLong + '\n' + 
                "значение после инкремента - " + ++maxLong + '\n' + "значение после декремента - " 
                + --maxLong + '\n');

        System.out.println("Задание 5. Перестановка значений переменных \n");
        int var1 = 2;
        int var2 = 5;
        int tmp = var1;
        System.out.println("Перестановка значений с помощью третьей переменной \n" + 
                "исходные значения переменных - " + var1 + " и " + var2 + "\n" + 
                "новые значения переменных - " + (var1 = var2) + " и " + (var2 = tmp) + '\n');
        System.out.println("Перестановка значений с помощью арифметических операций \n" + 
                "исходные значения переменных - " + var1 + " и " + var2);
        var1 += var2;
        var2 = var1 - var2;
        var1 -= var2;
        System.out.println("новые значения переменных - " + var1 + " и " + var2 + '\n');
        System.out.println("Перестановка значений с помощью побитовой операции \n" + 
                "исходные значения переменных - " + var1 + " и " + var2);
        var1 ^= var2;
        var2 ^= var1;
        var1 ^= var2;
        System.out.println("новые значения переменных - " + var1 + " и " + var2 + '\n');

        System.out.println("Задание 6. Вывод символов и их кодов \n");
        char numSign = '#';
        char amp = '&';
        char commat = '@';
        char hat = '^';
        char lowbar = '_';
        int ascii35 = numSign;
        int ascii38 = amp;
        int ascii64 = commat;
        int ascii94 = hat;
        int ascii95 = lowbar;
        System.out.println("Код символа ASCII-таблицы Dec" + ascii35 + " - " + numSign + '\n' + 
                "Код символа ASCII-таблицы Dec" + ascii38 + " - " + amp + '\n' + 
                "Код символа ASCII-таблицы Dec" + ascii64 + " - " + commat + '\n' + 
                "Код символа ASCII-таблицы Dec" + ascii94 + " - " + hat + '\n' + 
                "Код символа ASCII-таблицы Dec" + ascii95 + " - " + lowbar + '\n');

        System.out.println("Задание 7. Вывод в консоль ASCII-арт Дюка \n");
        char sol = '/';
        char bsol = '\\';
        char lparen = '(';
        char rparen = ')';
        System.out.println("     " + sol + bsol);
        System.out.println("    " + sol + "  " + bsol);
        System.out.println("   " + sol + lowbar + lparen + " " + rparen + bsol);
        System.out.println("  " + sol + "      " + bsol);
        System.out.println(" " + sol + lowbar + lowbar + lowbar + lowbar + sol + bsol + lowbar + 
                lowbar + bsol + '\n');

        System.out.println("Задание 8. Вывод количества сотен, десятков и единиц числа \n");
        int num = 123;
        int hund = num / 100;
        int tens = num  % 100 / 10;
        int ones = num % 10;
        System.out.println("Число " + num + " содержит: \n" + "      " + hund + " сотню \n" + 
                "      " + tens + " десятка \n" + "      "  + ones + " единицы");
        System.out.println("Сумма его цифр = " + (hund + tens + ones));
        System.out.println("А произведение = " + (hund * tens * ones) + '\n');

        System.out.println("Задание 9. Вывод времени \n");
        int totalTime = 86_399;
        int hours = (totalTime / 3600) % 60;
        int min = (totalTime / 60) % 60;
        int sec = totalTime % 60;
        System.out.println(hours + ":" + min + ":" + sec);
    }
}
