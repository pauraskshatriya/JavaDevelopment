import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a Student? (True/False): ");
        isStudent = scanner.nextBoolean();

        // Group 1
        if(name.isEmpty()){
            System.out.println("You have not entered your name!");
        }
        else {
            System.out.println("Hello " + name + "!");
        }

        // Group 2
        if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if(age >= 18) {
            System.out.println("You are an adult!");
        }
        else if(age == 0) {
            System.out.println("You are a baby!");
        }
        else if(age < 0) {
            System.out.println("You have not been born yet!");
        }
        else {
            System.out.println("You are a minor!");
        }

        // Group 3
        if(isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        scanner.close();
    }
}