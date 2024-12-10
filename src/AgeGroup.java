public class AgeGroup {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        java.util.Scanner s1 = new java.util.Scanner(System.in);
        byte age = s1.nextByte();
        if (age >= 0 && age <= 5) {
            System.out.println("Infant");
        } else if (age > 5 && age <= 12) {
            System.out.println("Child");
        } else if (age > 12 && age <= 19) {
            System.out.println("Teenager");
        } else if (age > 19 && age <= 59) {
            System.out.println("Adult");
        } else if (age >= 60) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
