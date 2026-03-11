import java.util.Scanner;

class GreatestofThreeNumbers {

    void findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("First number is greatest");
        } 
        else if (b >= a && b >= c) {
            System.out.println("Second number is greatest");
        } 
        else {
            System.out.println("Third number is greatest");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        GreatestofThreeNumbers obj = new GreatestofThreeNumbers();
        obj.findLargest(a, b, c);

        sc.close();
    }
}