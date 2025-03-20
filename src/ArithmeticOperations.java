import java.util.Scanner;
public class ArithmeticOperations {
    public static int sum(int a, int b) {

        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multipication(int a, int b) {
        return a * b;
    }

    public static int modulus(int a, int b) {
        int answer = 0;
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            answer = a % b;
        }

        return answer;
    }


    public static int division(int a, int b) {
        int answer = 0;
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            answer = a / b;
        }
        return answer;
    }
}

class TestingClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Enter first number");
        a = input.nextInt();
        System.out.println("Enter second number");
        b = input.nextInt();

        System.out.println("The Addition of two number is : " + ArithmeticOperations.sum(a, b));
        System.out.println("The Subtraction of two number is : " + ArithmeticOperations.subtraction(a, b));
        System.out.println("The Multiplication of two number is : " + ArithmeticOperations.multipication(a, b));
        System.out.println("The division of two number is : " + ArithmeticOperations.division(a, b));
        System.out.println("The modulus of two number is : " + ArithmeticOperations.modulus(a, b));

    }

}






