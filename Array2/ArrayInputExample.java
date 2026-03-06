import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an array with 5 elements
        int numbers[] = new int[5];

        // Take input from the user
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display the numbers entered
        System.out.println("The numbers you entered are:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}