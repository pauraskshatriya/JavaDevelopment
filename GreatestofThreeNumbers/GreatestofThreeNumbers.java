import java.util.Scanner; // Fixed capitalization of 'import'

class GreatestOfThreeNumbers {

    // Made static so we don't need to create an object in main
    static void findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("First number (" + a + ") is the greatest.");
        } 
        // Simplified logic: If we reach here, 'a' is definitely not the greatest.
        // Therefore, we only need to compare 'b' and 'c'.
        else if (b >= c) {
            System.out.println("Second number (" + b + ") is the greatest.");
        } 
        else {
            System.out.println("Third number (" + c + ") is the greatest.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Added prompts so the user knows what to do
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        // Called directly without instantiation because the method is now static
        findLargest(a, b, c);

        sc.close();
    }
}
