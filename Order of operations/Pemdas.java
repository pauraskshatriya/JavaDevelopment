public class Pemdas {
    public static void main(String[] args) {
        System.out.println("Java follows operator precedence similar to PEMDAS:");
        
        // Parentheses first, then multiplication/division (left to right), then addition
        double result = 3 + (4 * (7 - 5)) / 2.0;
        
        System.out.printf("Result of 3 + 4 * (7 - 5) / 2.0 = %.2f%n", result);
    }
}   