public class Discount {
    public static void main(String[] args) {
        System.out.print("Enter the purchase amount: ");
        java.util.Scanner s1 = new java.util.Scanner(System.in);
        double amount = s1.nextDouble();
        System.out.print("Are you a member? (Y/N): ");
        char member = s1.next().charAt(0);
        double discount;
        if (member == 'Y' || member == 'y') {
            if (amount <= 1000) {
                discount = amount * 0.05;
            } else if (amount > 1000 && amount <= 5000) {
                discount = amount * 0.10;
            } else {
                discount = amount * 0.15;
            }
        } else {
            if (amount <= 1000) {
                discount = amount * 0.02;
            } else if (amount > 1000 && amount <= 5000) {
                discount = amount * 0.05;
            } else {
                discount = amount * 0.10;
            }
        }
        System.out.println("Discount: " + discount);
    }
}
