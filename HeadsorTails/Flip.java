import java.util.Random;

public class Flip {
    public static void main(String[] args) {

        // Create Random object
        Random random = new Random();

        // Generate 0 or 1
        int toss = random.nextInt(2);

        // Decide result
        String result = (toss == 0) ? "HEADS" : "TAILS";

        // Display result
        System.out.println("🪙 Coin Toss Result: " + result);

        // Extra feedback
        if (result.equals("HEADS")) {
            System.out.println("You got lucky with Heads!");
        } else {
            System.out.println("It's Tails this time!");
        }
    }
}