public class SalaryTax {
    public static void main(String[] args) {
        double salary, tax;
        System.out.print("Enter the salary: ");
        java.util.Scanner s1 = new java.util.Scanner(System.in);
        salary = s1.nextDouble();
        System.out.println("Enter tax rate: ");
        tax = s1.nextDouble();

        if (salary <= 250000) {
            tax = 0;
        } else if (salary > 250000 && salary <= 500000) {
            tax = (salary - 250000) * 0.05;
        } else if (salary > 500000 && salary <= 1000000) {
            tax = (salary - 500000) * 0.1 + 250000 * 0.05;
        } else {
            tax = (salary - 1000000) * 0.15 + 500000 * 0.1 + 250000 * 0.05;
        }
        System.out.println("Tax: " + tax);
    }
}
