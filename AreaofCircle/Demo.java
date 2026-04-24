import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter radius of the circle: ");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                return;
            }

            double r = sc.nextDouble();

            if (r < 0) {
                System.out.println("Radius cannot be negative.");
                return;
            }

            double area = Math.PI * r * r;
            System.out.printf("Area of circle: %.2f%n", area);
        }
    }
}