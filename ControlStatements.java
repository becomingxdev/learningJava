//Imports:
import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        for (int i = 1; i <= score; i++) {
            if (i >= 90) {
                System.out.println("Number " + i + ": Excellent");
            } else if (i >= 80) {
                System.out.println("Number " + i + ": Very Good");
            } else if (i >= 70) {
                System.out.println("Number " + i + ": Good");
            } else {
                System.out.println("Number " + i + ": Needs improvement by" + (70 - i));
            }
        }

        sc.close();
    }
}