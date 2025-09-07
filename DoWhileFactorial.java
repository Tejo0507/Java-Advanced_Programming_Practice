import java.util.Scanner;

public class DoWhileFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int num = sc.nextInt();

        int fact = 1;
        int i = 1;
        if (num == 0) {
            System.out.println("Factorial = 1");
        } else {
            do {
                fact *= i;
                i++;
            } while (i <= num);
            System.out.println("Factorial = " + fact);
        }
    }
}