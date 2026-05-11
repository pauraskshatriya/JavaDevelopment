import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Simple Mad Libs Game

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Mad Libs Game! ===\n");

        // User inputs
        System.out.print("Enter an adjective (description): ");
        String adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (animal or person): ");
        String noun1 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = scanner.nextLine();

        System.out.print("Enter a verb ending with -ing: ");
        String verb1 = scanner.nextLine();

        System.out.print("Enter one final adjective: ");
        String adjective3 = scanner.nextLine();

        // Story output
        System.out.println("\n===== YOUR STORY =====");
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("Inside one exhibit, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and was busy " + verb1 + "!");
        System.out.println("I felt completely " + adjective3 + "!");
        System.out.println("======================");

        scanner.close();
    }
}