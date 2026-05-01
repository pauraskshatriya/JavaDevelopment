import java.util.Random;

public class Flip {
    public static void main(String[] args) {

        Random random = new Random();

        int toss = random.nextInt(2);

        String result = (toss == 0) ? "HEADS" : "TAILS";

        System.out.println("Coin toss result: " + result);
    }
}