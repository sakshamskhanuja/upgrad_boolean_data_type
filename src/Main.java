import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the age.
        Scanner scanner = new Scanner(System.in);

        // Scans the age.
        int age = scanner.nextInt();

        // Scans the brother's age.
        int ageBrother = scanner.nextInt();

        // Checks if user has provided valid age.
        if (age < 0 || ageBrother < 0) {
            System.out.println("false");
            return;
        }

        // Checks offer is available.
        if (age < 25 && ageBrother < 25) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}