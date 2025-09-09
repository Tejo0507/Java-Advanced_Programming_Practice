import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks (0 to 100):");
        int marks = sc.nextInt();
        int grade = marks / 10;

        switch (grade) {
            case 10:
            case 9:
                System.out.println("Grade: A (Excellent)");
                break;
            case 8:
                System.out.println("Grade: B (Very Good)");
                break;
            case 7:
                System.out.println("Grade: C (Good)");
                break;
            case 6:
                System.out.println("Grade: D (Satisfactory)");
                break;
            default:
                if (marks >= 0 && marks < 60) {
                    System.out.println("Grade: F (Fail)");
                } else {
                    System.out.println("Invalid marks.");
                }
        }
    }
}