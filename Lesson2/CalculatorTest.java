import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Калькулятор \n");
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            Calculator calculatorOne = new Calculator();
            System.out.println("Введите первое число:");
            calculatorOne.setA(scanner.nextInt());
            System.out.println("Введите знак математической операции (+, -, *, /, %, ^):");
            calculatorOne.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число:");
            calculatorOne.setB(scanner.nextInt());
            calculatorOne.calculationExpression();
            System.out.println(calculatorOne.getA() + " " + calculatorOne.getSign() + " " + 
                    calculatorOne.getB() + " = " + calculatorOne.getResult());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                choice = scanner.next();
            } while(!(choice.equals("yes") || choice.equals("no")));
        } while(choice.equals("yes"));
        scanner.close();
    }
}