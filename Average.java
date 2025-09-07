import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        System.out.println("Enter numbers (-1 to stop): ");
        int num = sc.nextInt();

        while (num != -1) {
            sum += num;
            count++;
            num = sc.nextInt();
        }

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Average = " + avg);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}