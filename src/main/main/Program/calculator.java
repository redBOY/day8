package main.Program;

public class calculator {
    public static void main(String[] args) {
        double a = 44, b = 23, result;
        char operator = '-';
        {
            System.out.println("enter the operator (+, -, *, / or %)");
            System.out.println("enter the first number");
            System.out.println("enter the second number");
            switch (operator) {
                case '+':
                    result = a + b;
                    System.out.println("addition of two numbers is" + result);
                    break;
                case '-':
                    result = a - b;
                    System.out.println("subtration of two numbers is" + result);
                    break;
                case '*':
                    result = a * b;
                    System.out.println("multiplication of two numbers is" + result);
                    break;
                case '/':
                    result = a / b;
                    System.out.println("division of two numbers is" + result);
                    break;
                case '%':
                    result = a % b;
                    System.out.println("modulus is" + result);
                    break;
                default:
                    System.out.println("you have entered a wrong operator");
                    break;
            }
        }
    }
}




