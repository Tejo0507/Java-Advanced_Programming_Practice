import java.util.Scanner;

public class WhileNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = sc.nextInt();

        int i = 1;
        while (i <= limit) {
            System.out.print(i + " ");
            i++;
        }
    }
}