import java.math.BigDecimal;
import java.math.RoundingMode;

public class Nested {
    public static void main(String[] args) {
        final boolean isStudent = true;
        final boolean isSenior = false;

        // Use BigDecimal for precise currency calculations
        final BigDecimal BASE_PRICE = new BigDecimal("9.99");
        final BigDecimal STUDENT_RATE = new BigDecimal("0.10");
        final BigDecimal SENIOR_RATE = new BigDecimal("0.20");

        BigDecimal finalPrice;
        String discountMessage;

        if (isStudent && isSenior) {
            // Combined discount: 10% + 20% = 30% off
            BigDecimal totalRate = STUDENT_RATE.add(SENIOR_RATE);
            finalPrice = BASE_PRICE.multiply(BigDecimal.ONE.subtract(totalRate));
            discountMessage = "both student (10%) and senior (20%) discount";
        } else if (isStudent) {
            finalPrice = BASE_PRICE.multiply(BigDecimal.ONE.subtract(STUDENT_RATE));
            discountMessage = "student discount of 10%";
        } else if (isSenior) {
            finalPrice = BASE_PRICE.multiply(BigDecimal.ONE.subtract(SENIOR_RATE));
            discountMessage = "senior discount of 20%";
        } else {
            finalPrice = BASE_PRICE;
            discountMessage = "No discount applied";
        }

        // Ensure 2 decimal places for currency
        finalPrice = finalPrice.setScale(2, RoundingMode.HALF_UP);

        System.out.println("You get a " + discountMessage + ".");
        System.out.printf("Original: $%.2f | Final Price: $%.2f%n", BASE_PRICE, finalPrice);
    }
}   