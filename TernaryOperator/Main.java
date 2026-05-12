import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }

            int number = scanner.nextInt();

            boolean isEven = number % 2 == 0;

            System.out.println("The number " + number + " is " 
                    + (isEven ? "Even" : "Odd") + ".");
        }
    }
}