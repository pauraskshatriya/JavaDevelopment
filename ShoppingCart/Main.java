import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        double price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        System.out.printf(
            "%nYou bought %d %s(s)%nTotal: $%.2f%n",
            quantity, item, total
        );

        scanner.close();
    }
}