import java.util.Random;

public class Flip {
    public static void main(String[] args) {
        final Random random = new Random();
        final boolean isHeads = random.nextBoolean(); // cleaner than nextInt(2)
        final String result = isHeads ? "HEADS" : "TAILS";

        System.out.println("Coin Toss Result: " + result);
        System.out.println(isHeads ? "You got lucky with Heads!" : "It's Tails this time!");
    }
}