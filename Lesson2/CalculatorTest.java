import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Калькулятор \n");
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            Calculator calculator = new Calculator();
            System.out.println("Введите первое число:");
            calculator.setA(scanner.nextInt());
            System.out.println("Введите знак математической операции (+, -, *, /, %, ^):");
            calculator.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число:");
            calculator.setB(scanner.nextInt());
            calculator.calculate();
            System.out.println(calculator.getA() + " " + calculator.getSign() + " " + 
                    calculator.getB() + " = " + calculator.getResult());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                choice = scanner.next();
            } while(!choice.equals("yes") && !choice.equals("no"));
        } while(choice.equals("yes"));
        scanner.close();
    }
}