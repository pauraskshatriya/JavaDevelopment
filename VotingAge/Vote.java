import java.util.Scanner;

class Vote {

    static void checkVote(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative.");
        } else if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }

            int age = sc.nextInt();
            checkVote(age);
        }
    }
}