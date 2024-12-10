public class SwitchCalc {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        java.util.Scanner s1 = new java.util.Scanner(System.in);
        double num1 = s1.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = s1.nextDouble();
        System.out.print("Enter the operation (+, -, *, /, %): ");
        char op = s1.next().charAt(0);
        System.out.print("Result: ");
        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}
