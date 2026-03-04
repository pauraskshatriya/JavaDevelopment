public class ghi {
   public static void main(String[] args) {

       double power = Math.pow(3, 4);
       double absolute = Math.abs(-5);
       double squareRoot = Math.sqrt(16);
       long rounded = Math.round(3.14);   // round returns long
       double ceiling = Math.ceil(3.14);
       double floorValue = Math.floor(3.14);
       int maximum = Math.max(10, 20);
       int minimum = Math.min(10, 20);

       System.out.println("Power: " + power);
       System.out.println("Absolute: " + absolute);
       System.out.println("Square Root: " + squareRoot);
       System.out.println("Rounded: " + rounded);
       System.out.println("Ceiling: " + ceiling);
       System.out.println("Floor: " + floorValue);
       System.out.println("Maximum: " + maximum);
       System.out.println("Minimum: " + minimum);
   }
}