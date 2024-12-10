import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        double p, r, t;
        System.out.print("Enter the principal amount: ");
        Scanner s1 = new Scanner(System.in);
        p = s1.nextDouble();
        System.out.print("Enter the rate of interest: ");
        r = s1.nextDouble();
        System.out.print("Enter the time period: ");
        t = s1.nextDouble();

        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}
