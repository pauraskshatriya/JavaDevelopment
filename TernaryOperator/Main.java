import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }

            int number = scanner.nextInt();
            String result = (number % 2 == 0) ? "Even" : "Odd";

            System.out.println(number + " is " + result + ".");
        }
    }
}