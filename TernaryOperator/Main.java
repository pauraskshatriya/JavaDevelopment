
public class Main {
    public static void main(String[] args) {
        int number = 10;

        String parity = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number " + number + " is " + parity + ".");
    }
}