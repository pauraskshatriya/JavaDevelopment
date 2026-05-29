import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the radius of the circle: ");

            if (!sc.hasNextDouble()) {
                System.out.println("Error: Please enter a valid numeric value.");
                return;
            }

            double radius = sc.nextDouble();

            if (radius <= 0) {
                System.out.println("Error: Radius must be greater than 0.");
                return;
            }

            double area = Math.PI * Math.pow(radius, 2);
            double circumference = 2 * Math.PI * radius;

            System.out.printf("Area of the circle: %.2f%n", area);
            System.out.printf("Circumference of the circle: %.2f%n", circumference);
        }
    }
}