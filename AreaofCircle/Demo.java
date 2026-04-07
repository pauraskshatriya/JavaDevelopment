import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        
        if (sc.hasNextDouble()) {
            double r = sc.nextDouble();

            if (r >= 0) {
                double area = Math.PI * r * r;
                System.out.printf("Area of circle: %.2f%n", area);
            } else {
                System.out.println("Radius cannot be negative.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        sc.close();
    }
}