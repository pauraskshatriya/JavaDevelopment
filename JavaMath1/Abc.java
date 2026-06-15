import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter length of side A in cm: ");
            double a = scanner.nextDouble();

            System.out.print("Enter length of side B in cm: ");
            double b = scanner.nextDouble();

            if (a <= 0 || b <= 0) {
                System.out.println("Error: Side lengths must be positive numbers.");
                return;
            }

            double c = Math.sqrt(a * a + b * b);

            System.out.printf("The hypotenuse is: %.2f cm%n", c);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        }
    }
}