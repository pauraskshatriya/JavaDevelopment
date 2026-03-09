import java.util.Random;

public class Flip {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isHeads = random.nextBoolean();

        System.out.println(isHeads ? "HEADS" : "TAILS");
    }
}
