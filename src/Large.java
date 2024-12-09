public class Large {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 20, out;
        if (a > b && a > c) {
            out = a;
        } else if (b > a && b > c) {
            out = b;
        } else {
            out = c;
        }
        System.out.println("The largest no. is: " + out);
    }
}
