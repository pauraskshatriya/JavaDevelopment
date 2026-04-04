import java.util.Scanner;

class Largest{

    // Method to find and display the largest number
    void findLargest(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Largest number is: " + num1);
        } 
        else if (num2 > num1) {
            System.out.println("Largest number is: " + num2);
        } 
        else {
            System.out.println("Both numbers are equal: " + num1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Object creation and method call
        LargestNumber obj = new LargestNumber();
        obj.findLargest(num1, num2);

        scanner.close();
    }
}