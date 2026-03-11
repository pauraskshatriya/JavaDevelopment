import java.util.Scanner;

class EvenOdd {

    void checkNumber(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        EvenOdd obj = new EvenOdd();  // object creation
        obj.checkNumber(num);         // method call

        sc.close();
    }
}