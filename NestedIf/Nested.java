public class Nested {
    public static void main(String[] args) {
        final boolean isStudent = true;
        final boolean isSenior = false;

        // Constants for pricing and discounts
        final double BASE_PRICE = 9.99;
        final double STUDENT_DISCOUNT_RATE = 0.10;
        final double SENIOR_DISCOUNT_RATE = 0.20;

        // Combined discount: 10% + 20% = 30% off → multiplier = 0.7
        final double COMBINED_DISCOUNT_MULTIPLIER = 1.0 - (STUDENT_DISCOUNT_RATE + SENIOR_DISCOUNT_RATE);
        final double STUDENT_ONLY_MULTIPLIER = 1.0 - STUDENT_DISCOUNT_RATE;
        final double SENIOR_ONLY_MULTIPLIER = 1.0 - SENIOR_DISCOUNT_RATE;

        double discountMultiplier = 1.0; // No discount by default

        if (isStudent && isSenior) {
            System.out.println("You get both student (10%) and senior (20%) discount");
            discountMultiplier = COMBINED_DISCOUNT_MULTIPLIER;
        } else if (isStudent) {
            System.out.println("You get a student discount of 10%");
            discountMultiplier = STUDENT_ONLY_MULTIPLIER;
        } else if (isSenior) {
            System.out.println("You get a senior discount of 20%");
            discountMultiplier = SENIOR_ONLY_MULTIPLIER;
        } else {
            System.out.println("No discount applied");
        }

        double finalPrice = BASE_PRICE * discountMultiplier;

        System.out.printf("The price of a ticket is: $%.2f%n", finalPrice);
    }
}   