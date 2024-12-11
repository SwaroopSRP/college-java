import java.util.Scanner;

public class LuckyVehicleNumber {
    public static void main(String[] args) {
        Scanner s;
        System.out.print("Enter Vehicle Number: ");
        s = new Scanner(System.in);
        int sum = s.nextInt();
        System.out.print("Enter your Lucky Number: ");
        s = new Scanner(System.in);
        int num = s.nextShort();
        while (sum >= 10) {
            int temp = sum;
            sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }
        if (num == sum) {
            System.out.println("Congratulations!! your vehicle is your lucky number!!");
        } else {
            System.out.println("Sorry! Your vehicle number is not matching your lucky number!!");
        }

    }
}
