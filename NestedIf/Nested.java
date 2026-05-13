public class Nested {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        double discount = 1.0;

        if (isStudent && isSenior) {
            System.out.println("You get both student (10%) and senior (20%) discount");
            discount = 0.7;
        } else if (isStudent) {
            System.out.println("You get a student discount of 10%");
            discount = 0.9;
        } else if (isSenior) {
            System.out.println("You get a senior discount of 20%");
            discount = 0.8;
        } else {
            System.out.println("No discount applied");
        }

        price *= discount;

        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}