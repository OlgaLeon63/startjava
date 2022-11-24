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
        int per1 = 2;
        int per2 = 5;
        int per3 = per1;
        System.out.println("Перестановка значений с помощью третьей переменной \n" + 
                "исходные значения переменных - " + per1 + " и " + per2 + "\n" + 
                "новые значения переменных - " + (per1 = per2) + " и " + (per2 = per3) + '\n');
        System.out.println("Перестановка значений с помощью арифметических операций \n" + 
                "исходные значения переменных - " + per1 + " и " + per2);
        per1 += per2;
        per2 = per1 - per2;
        per1 -= per2;
        System.out.println("новые значения переменных - " + per1 + " и " + per2 + '\n');
        System.out.println("Перестановка значений с помощью побитовой операции \n" + 
                "исходные значения переменных - " + per1 + " и " + per2);
        per1 ^= per2;
        per2 ^= per1;
        per1 ^= per2;
        System.out.println("новые значения переменных - " + per1 + " и " + per2 + '\n');

        System.out.println("Задание 6. Вывод символов и их кодов \n");
        char dec35 = '#';
        char dec38 = '&';
        char dec64 = '@';
        char dec94 = '^';
        char dec95 = '_';
        System.out.println("Код символа ASCII-таблицы Dec35 - " + dec35 + '\n' + 
                "Код символа ASCII-таблицы Dec38 - " + dec38 + '\n' + 
                "Код символа ASCII-таблицы Dec64 - " + dec64 + '\n' + 
                "Код символа ASCII-таблицы Dec94 - " + dec94 + '\n' + 
                "Код символа ASCII-таблицы Dec95 - " + dec95 + '\n');

        System.out.println("Задание 7. Вывод в консоль ASCII-арт Дюка \n");
        char dec47 = '/';
        char dec92 = '\\';
        char dec40 = '(';
        char dec41 = ')';
        System.out.println("     " + dec47 + dec92);
        System.out.println("    " + dec47 + "  " + dec92);
        System.out.println("   " + dec47 + dec95 + dec40 + " " + dec41 + dec92);
        System.out.println("  " + dec47 + "      " + dec92);
        System.out.println(" " + dec47 + dec95 + dec95 + dec95 + dec95 + dec47 + dec92 + dec95 + 
                dec95 + dec92 + '\n');

        System.out.println("Задание 8. Вывод количества сотен, десятков и единиц числа \n");
        int numb = 123;
        int hund = numb / 100;
        int doz = numb  % 100 / 10;
        int singl = numb % 10;
        System.out.println("Число " + numb + " содержит: \n" + "      " + hund + " сотню \n" + 
                "      " + doz + " десятка \n" + "      "  + singl + " единицы");
        System.out.println("Сумма его цифр = " + (hund + doz + singl));
        System.out.println("А произведение = " + (hund * doz * singl) + '\n');

        System.out.println("Задание 9. Вывод времени \n");
        int totalTime = 86_399;
        int hours = (totalTime / 3600) %60;
        int min = (totalTime / 60) % 60;
        int sec = totalTime % 60;
        System.out.println(hours + ":" + min + ":" + sec);
    }
}
