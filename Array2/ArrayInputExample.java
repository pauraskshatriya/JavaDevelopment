import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {
        // Using try-with-resources ensures the Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {
            
            // Define size in one place for easier updates later
            int size = 5;
            int[] numbers = new int[size];

            System.out.println("Enter " + size + " numbers:");

            // Use .length to avoid "magic numbers" in loops
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();
            }

            System.out.println("The numbers you entered are:");

            // Use an enhanced for-loop (for-each) for cleaner output logic
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        } 
    }
}
