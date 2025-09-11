import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Rate of Interest: ");
        float rate = sc.nextFloat();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        for (int i = 1; i <= years; i++) {
            float si = (principal * rate * i) / 100;
            System.out.println("Year " + i + ": Simple Interest = " + si);
        }
    }
}