public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Java arithmetic operations:");

        // Integer ops
        int x = 10, y = 5;
        System.out.printf("x + y => %d + %d = %d%n", x, y, x + y);

        int a = 15, b = 12;
        System.out.printf("a - b => %d - %d = %d%n", a, b, a - b);

        // Double ops
        double d = 1.5, e = 3.9;
        System.out.printf("d * e => %.1f * %.1f = %.2f%n", d, e, d * e);

        double g = 1.7, h = 0.9;
        System.out.printf("g / h => %.1f / %.1f = %.3f%n", g, h, g / h);

        double w = 10, v = 3;
        System.out.printf("w %% v => %.0f %% %.0f = %.0f%n", w, v, w % v);
    }
}