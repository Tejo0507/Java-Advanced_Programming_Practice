import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the current temperature (°C): ");
        int temp = sc.nextInt();

        if (temp > 30) {
            System.out.println("It's hot!");
        } else if (temp >= 20) {
            System.out.println("It's warm.");
        } else if (temp >= 10) {
            System.out.println("It's cool.");
        } else {
            System.out.println("It's cold.");
        }
    }
}