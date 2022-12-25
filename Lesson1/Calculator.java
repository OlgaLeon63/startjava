public class Calculator {

    public static void main(String[] args) {
        System.out.println("Калькулятор \n");
        int a = 3;
        int b = 3;
        int result = 1;
        char additionOp = '+';
        char subtractionOp = '-';
        char multiplicationOp = '*';
        char divisionOp = '/';
        char modulusOp = '%';
        char powerOp = '^';
        char sign = powerOp;
        if(sign == additionOp) {
            result = a + b;
        } else if(sign == subtractionOp) {
            result = a - b;
        } else if(sign == multiplicationOp) {
            result = a * b;
        } else if(sign == divisionOp) {
            result = a / b;
        } else if(sign == modulusOp) {
            result = a % b;
        } else if(sign == powerOp) {
            for(int counter = 1; counter <= b; counter++) {
                result = result * a;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}