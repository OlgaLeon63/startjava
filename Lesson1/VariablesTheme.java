public class VariablesTheme {

    public static void main(String[] args) {

        System.out.println('\n' + "Задание 1. Вывод значений переменных на консоль \n");
        byte operativeMemory = 8;
        short windows = 10;
        int hardDiskSize = 500_000;
        long sborka = 19_045L;
        float processorV = 3.50f;
        double displayRate = 60.000;
        char cores = '4';
        boolean diskDriveActive = true;
        System.out.println(operativeMemory + " - оперативная память в Гб");
        System.out.println(windows + " - версия системы windows");
        System.out.println(hardDiskSize + " - размер жесткого диска в Гб");
        System.out.println(sborka + " - сборка ОС");
        System.out.println(processorV + " - базовая скорость процессора в Гц");
        System.out.println(displayRate + " - частота обновления в  Гц");
        System.out.println(cores + " - количество ядер");
        if(diskDriveActive == true){
            System.out.println("Дисковод отсутствует" + '\n');
        }

        System.out.println("Задание 2. Расчет стоимости товара со скидкой \n");
        int pen = 100;
        int book = 200;
        float discount = 0.11f;
        System.out.println("сумма скидки 11% - " + (pen + book) * discount + " руб");
        System.out.println("общая стоимость товаров со скидкой 11% - " + (pen + book - (pen + 
                book) * discount) + " руб \n");

        System.out.println("Задание 3. Вывод слова JAVA \n");
        char letterSmallA = 'a';
        char letterJ = 'J';
        char letterV = 'V';
        char letterSmallV = 'v';
        System.out.println("   " + letterJ + "    " + letterSmallA + "  " + letterSmallV + 
                "     " + letterSmallV + "  " + letterSmallA + "   \n");
        System.out.println("   " + letterJ + "   " + letterSmallA + " " + letterSmallA + "  " + 
                letterSmallV + "   " + letterSmallV + "  " + letterSmallA + " " + letterSmallA + 
                "  \n");
        System.out.println(letterJ + "  " + letterJ + "  " + letterSmallA + letterSmallA + 
                letterSmallA + letterSmallA + letterSmallA + "  " + letterV + " " + letterV + "  " 
                + letterSmallA + letterSmallA + letterSmallA + letterSmallA + letterSmallA + 
                " \n");
        System.out.println(" " + letterJ + letterJ + "  " + letterSmallA + "     " + letterSmallA + 
                "  " + letterV + "  " + letterSmallA + "     " + letterSmallA + '\n');

        System.out.println("Задание 4. Вывод min и max значений целых числовых типов  \n");
        byte b = 127;
        short s = 32_767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;
        System.out.println("Переменная byte \n" + "первоначальное значение - " + b + '\n' + 
                "значение после инкремента - " + b++ + '\n' + "значение после декремента - " + b-- 
                + '\n');
        System.out.println("Переменная short \n" + "первоначальное значение - " + s + '\n' + 
                "значение после инкремента - " + s++ + '\n' + "значение после декремента - " + s-- 
                + '\n');
        System.out.println("Переменная int \n" + "первоначальное значение - " + i + '\n' + 
                "значение после инкремента - " + i++ + '\n' + "значение после декремента - " + i-- 
                + '\n');
        System.out.println("Переменная long \n" + "первоначальное значение - " + l + '\n' + 
                "значение после инкремента - " + l++ + '\n' + "значение после декремента - " + l-- 
                + '\n');

        System.out.println("Задание 5. Перестановка значений переменных \n");
        int per1 = 2;
        int per2 = 5;
        int per3 = per1;
        System.out.println("Перестановка значений с помощью третьей переменной \n" + 
                "исходные значения переменных - " + per1 + " и " + per2 + "\n" + 
                "новые значения переменных - " + (per1 = per2) + " и " + (per2 = per3) + '\n');
        per2 = per1;
        per1 = per3;
        System.out.println("Перестановка значений с помощью арифметических операций \n" + 
                "исходные значения переменных - " + per1 + " и " + per2);
        per1 = per1 + per2;
        per2 = per1 - per2;
        per1 = per1 - per2;
        System.out.println("новые значения переменных - " + per1 + " и " + per2 + '\n');
        per2 = per1;
        per1 = per3;
        System.out.println("Перестановка значений с помощью побитовой операции \n" + 
                "исходные значения переменных - " + per1 + " и " + per2);
        per1 = per1 ^ per2;
        per2 = per2 ^ per1;
        per1 = per1 ^ per2;
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
