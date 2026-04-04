public class Break{
    public static void main(String[] args) {

        System.out.println("Printing numbers from 1 to 10 (stops at 5):");

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Loop stopped at i = " + i);
                break; // exits the loop when i becomes 6
            }
            System.out.println(i);
        }

        System.out.println("Loop has ended.");
    }
}