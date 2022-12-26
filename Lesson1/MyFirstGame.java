public class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("Игра Угадай число \n");
        int hiddenNum = 16;
        int max = 100;
        for(int i = 100; i >= hiddenNum && i > 1; i -= 20) {
            max = i;
            if(hiddenNum < max) {
            System.out.println("Число " + max + " больше того, что загадал компьютер");
            } else if(hiddenNum > max) {
            System.out.println("Число " + max + " меньше того, что загадал компьютер");
            } else if(hiddenNum == max) {
            System.out.println("Загаданное число " + hiddenNum + ". Вы победили!");
            }
        }
        for(int i = (max - 1); i >= hiddenNum && i > 0; i -= 2) {
            max = i;
            if(hiddenNum < max) {
            System.out.println("Число " + max + " больше того, что загадал компьютер");
            } else if(hiddenNum > max) {
            System.out.println("Число " + max + " меньше того, что загадал компьютер");
            } else if(hiddenNum == max) {
            System.out.println("Загаданное число " + hiddenNum + ". Вы победили!");
            }
        }
        for(int i = (max + 1); i <= hiddenNum && i > 0; i += 2) {
            max = i;
            if(hiddenNum < max) {
            System.out.println("Число " + max + " больше того, что загадал компьютер");
            } else if(hiddenNum > max) {
            System.out.println("Число " + max + " меньше того, что загадал компьютер");
            } else if(hiddenNum == max) {
            System.out.println("Загаданное число " + hiddenNum + ". Вы победили!");
            }
        }
        if(hiddenNum > max) {
            max++;
            System.out.println("Загаданное число " + hiddenNum + ". Вы победили!");
        } else if(hiddenNum < max && hiddenNum > 1) {
            max--;
            System.out.println("Загаданное число " + hiddenNum + ". Вы победили!");
        }
    }
}