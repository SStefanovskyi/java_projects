import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getDouble();
        double num2 = getDouble();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Operation result: " + result);
    }

    public static double getDouble(){
        System.out.println("Enter the number: ");
        double num;

        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        }
        else{
            System.out.println("You made a mistake while typing a number. Try again.");
            scanner.next();                     // recursion
            num = getDouble();
        }

        return num;
    }

    public static char getOperation(){
        System.out.println("Enter the operation: ");
        char operation;

        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }
        else {
            System.out.println("You made a mistake when entering an operation. Try again.");
            scanner.next();                      // recursion
            operation = getOperation();
        }

        return operation;
    }

    public static double calc(double num1, double num2, char operation){
        double result;

        switch(operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("The operation is not recognized. Repeat input.");
                result = calc(num1, num2, getOperation());                   // recursion
        }

        return result;
    }
}