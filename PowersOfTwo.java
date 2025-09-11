import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter exponent limit: ");
        int limit = sc.nextInt();

        int i = 0;
        do {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
            i++;
        } while (i <= limit);
    }
}