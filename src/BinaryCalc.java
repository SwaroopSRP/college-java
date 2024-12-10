import java.util.Scanner;

public class BinaryCalc {
    public static void main(String[] args) {
        System.out.print("Enter 1st no.: ");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        System.out.print("Enter 2nd no.: ");
        a = new Scanner(System.in);
        int y = a.nextInt();
        System.out.print("Enter binary operator (+, -, *, /, %): ");
        a = new Scanner(System.in);
        char o = a.next().charAt(0);
        System.out.printf("Ans of %d %c %d = ", x, o, y);
        switch (o) {
            case '+':
                System.out.println((x + y));
                break;
            case '-':
                System.out.println((x - y));
                break;
            case '*':
                System.out.println((x * y));
                break;
            case '/':
                System.out.println((x / y));
                break;
            case '%':
                System.out.println((x % y));
                break;
            default:
                System.out.println("ERROR!");
        }
    }
}
