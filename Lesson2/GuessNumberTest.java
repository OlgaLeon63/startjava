import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра Угадай число \n");
        System.out.println("Введите имя первого игрока:");
        String nameOne = scanner.nextLine();
        Player playerOne = new Player(nameOne);
        System.out.println("Введите имя второго игрока:");
        String nameTwo = scanner.nextLine();
        Player playerTwo = new Player(nameTwo);

        GuessNumber play = new GuessNumber(playerOne, playerTwo); 
        String choice = "yes";
        do {
            play.guessNumber();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                choice = scanner.nextLine();
            } while(!choice.equals("yes") && !choice.equals("no"));
        } while(choice.equals("yes"));
        scanner.close();
    }
}