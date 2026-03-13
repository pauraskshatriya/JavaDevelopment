public class Break{
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            if(i == 6) {
                break; // loop stops when i becomes 6
            }
            System.out.println(i);
        }

    }
}
