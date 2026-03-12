import java.util.Scanner;

class Large {

    void findLargest(int a, int b) {
        if (a > b) {
            System.out.println("First number is greater");
        } 
        else if (b > a) {
            System.out.println("Second number is greater");
        } 
        else {
            System.out.println("Both numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Large obj = new Large();   // object creation
        obj.findLargest(a, b);     // method call

        sc.close();
    }
}