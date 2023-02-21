import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    
    public void guessNumber() {
        System.out.println("Загадывается число");
        int hiddenNum = (int)(Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Ход игрока " + playerOne.getName() + ". Введите число: ");
            int guessNumber = scanner.nextInt();
            if(hiddenNum < guessNumber) {
                System.out.println("Число " + guessNumber + " больше того, что загадал компьютер");
            } else if(hiddenNum > guessNumber) {
                System.out.println("Число " + guessNumber + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Загаданное число " + hiddenNum + ". Вы победили!");
                break;
            }
            System.out.println("Ход игрока " + playerTwo.getName() + ". Введите число: ");
            guessNumber = scanner.nextInt();
            if(hiddenNum < guessNumber) {
                System.out.println("Число " + guessNumber + " больше того, что загадал компьютер");
            } else if(hiddenNum > guessNumber) {
                System.out.println("Число " + guessNumber + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Загаданное число " + hiddenNum + ". Вы победили!");
                break;
            }
        }
    }
}