public class Main {
    public static void main(String[] args) {
        System.out.println("Here I am using Java's Increment & Decrement Operators:\n"
                + "Using x = 1 & y = 3\n"
                + "First, we will increment x.\n"
                + "Then, we will decrement y.\n"
                + "Using x++ twice and y-- twice");

                int x = 1;
                int y = 3;

                x++;
                x++;

                y--;
                y--;

                System.out.println("Value of x after using Increment operator: " + x);
                System.out.println("Value of y after using Decrement operator: " + y);

    }
}
