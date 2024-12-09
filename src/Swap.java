public class Swap {
    public static void main(String[] args) {
        // write a program to swap two numbers without a temporary variable
        int a = 5, b = 10;
        System.out.println("Before swapping: a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Before swapping: a = " + a + " b = " + b);
    }
}
