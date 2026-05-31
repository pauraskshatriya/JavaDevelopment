import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<String> fruits = new ArrayList<>(List.of(
            "Apple", "Banana", "Coconut"
        ));

        fruits.sort(null); // null = natural ordering, same as Collections.sort

        fruits.forEach(System.out::println);
    }
}