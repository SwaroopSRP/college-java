public class Quad {
    public static void main(String[] args) {
        //  write a program to solve quadratic equations
        // ax^2 + bx + c = 0
        int a = 1, b = -2, c = -3;
        int d = (b * b) - (4 * a * c);
        if (d >= 0) {
            double x1 = -b + Math.sqrt(d) / 2 * a, x2 = -b - Math.sqrt(d) / 2 * a;;
            System.out.println("The roots are: " + x1 + " and " + x2);
        } else {
            System.out.println("Roots are imaginary!");
        }
    }
}
