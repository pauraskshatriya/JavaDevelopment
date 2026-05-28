public class Main {

    public static void main(String[] args) {
        // Display introduction using a formatted block for clarity
        System.out.println("=== Java Increment & Decrement Operators Demo ===");
        System.out.println("Initial values: counter = 1, decrementer = 3");
        System.out.println("Operations: Increment counter twice, decrement decrementer twice.\n");

        // Use descriptive names instead of x and y
        int counter = 1;
        int decrementer = 3;

        // Increment counter twice (equivalent to counter = counter + 1)
        counter++;
        counter++;

        // Decrement decrementer twice (equivalent to decrementer = decrementer - 1)
        decrementer--;
        decrementer--;

        // Output results using printf for aligned, clean formatting
        System.out.printf("Final value of counter     (after ++): %d%n", counter);
        System.out.printf("Final value of decrementer (after --): %d%n", decrementer);
    }
}   