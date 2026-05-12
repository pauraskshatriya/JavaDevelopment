import java.util.Scanner;

public class Weight {

    private static final double LBS_TO_KG = 0.453592;
    private static final double KG_TO_LBS = 2.20462;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter 1 or 2.");
            scanner.close();
            return;
        }

        int choice = scanner.nextInt();

        System.out.print("Enter the weight: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid weight input.");
            scanner.close();
            return;
        }

        double weight = scanner.nextDouble();
        double newWeight;

        switch (choice) {
            case 1:
                newWeight = weight * LBS_TO_KG;
                System.out.printf("The new weight in kgs is: %.2f%n", newWeight);
                break;

            case 2:
                newWeight = weight * KG_TO_LBS;
                System.out.printf("The new weight in lbs is: %.2f%n", newWeight);
                break;

            default:
                System.out.println("That was not a valid choice.");
        }

        scanner.close();
    }
}