import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}