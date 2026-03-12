import java.util.Scanner;

class Vote {

    void checkVote(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        Vote v = new Vote();   // creating object
        v.checkVote(age);      // calling method

        sc.close();
    }
}