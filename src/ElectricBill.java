public class ElectricBill {
//    Use if-else to calculate electricity bills based on unit consumption slabs.
    public static void main(String[] args) {
    // user input
        System.out.print("Enter the number of units consumed: ");
        java.util.Scanner s1 = new java.util.Scanner(System.in);
        int units = s1.nextInt();
        double bill;
        if (units <= 100) {
            bill = units * 1.20;
        } else if (units > 100 && units <= 300) {
            bill = 100 * 1.20 + (units - 100) * 2;
        } else if (units > 300 && units <= 500) {
            bill = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        } else {
            bill = 100 * 1.20 + 200 * 2 + 200 * 3 + (units - 500) * 4;
        }
        System.out.println("Electricity Bill: " + bill);
    }
}
