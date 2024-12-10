import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter a no. : ");
        Scanner inp = new Scanner(System.in);
        int input = inp.nextInt();
        if (input % 2 == 0) {
            System.out.println(input + " is even no.");
        } else {
            System.out.println(input + " is odd no.");
        }
    }
}
