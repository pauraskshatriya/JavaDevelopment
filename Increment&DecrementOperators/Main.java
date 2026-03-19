public class Main { // Fixed capitalization of 'public'

    public static void main(String[] args) {
        // Splitting the large print statement makes the code easier to read
        System.out.println("Here I am using Java's Increment & Decrement Operators:");
        System.out.println("Initial values: x = 1 & y = 3");
        System.out.println("First, we will increment x twice.");
        System.out.println("Then, we will decrement y twice.\n");

        int x = 1;
        int y = 3;

        // Increment x twice (x++ is shorthand for x = x + 1)
        x++;
        x++;

        // Decrement y twice (y-- is shorthand for y = y - 1)
        y--;
        y--;

        // Using printf (print formatted) for cleaner output without using the '+' sign
        System.out.printf("Value of x after using Increment operator: %d%n", x);
        System.out.printf("Value of y after using Decrement operator: %d%n", y);
    }
}
