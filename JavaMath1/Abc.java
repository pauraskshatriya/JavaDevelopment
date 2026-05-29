import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the length of side A: ");
            double a = scanner.nextDouble();

            System.out.print("Enter the length of side B: ");
            double b = scanner.nextDouble();

            double c = Math.sqrt(a * a + b * b);

          
            System.out.printf("The hypotenuse is: %.2f cm%n", c);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}