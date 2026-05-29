import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[]  args){
        ArrayList<String> fruits= new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Banana");
        fruits.add("Coconut");

        //list.remove(0);
        //fruits.set(0, "Pineapple");
        //System.out.println(fruits.get(3));
        //System.out.println(fruits.size());

        Collections.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }



    }
    
}
