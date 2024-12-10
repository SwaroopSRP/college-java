import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.print("Enter the day no. (1-7): ");
        Scanner s1 = new Scanner(System.in);
        byte wk_num = s1.nextByte();
        System.out.print("It is ");
        switch (wk_num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid input!");
        }
    }
}
