import java.util.Scanner;

class GreatestOfThreeNumbers {

    // Returns the greatest number instead of printing directly (better practice)
    static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } 
        else if (b >= c) {
            return b;
        } 
        else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();

            System.out.print("Enter the second number: ");
            int b = sc.nextInt();

            System.out.print("Enter the third number: ");
            int c = sc.nextInt();

            int result = findLargest(a, b, c);

            System.out.println("The greatest number is: " + result);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}