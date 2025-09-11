import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type add or subtract or multiply or divide:");
        String op = sc.nextLine();

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        if (op.equals("add")) {
            System.out.println("Answer: " + (a + b));
        } else if (op.equals("subtract")) {
            System.out.println("Answer: " + (a - b));
        } else if (op.equals("multiply")) {
            System.out.println("Answer: " + (a * b));
        } else if (op.equals("divide")) {
            System.out.println("Answer: " + (a / b));
        } else {
            System.out.println("Wrong input.");
        }
    }
}