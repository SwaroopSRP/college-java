import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        System.out.print("Enter your net percentage: ");
        Scanner s1 = new Scanner(System.in);
        byte perc = s1.nextByte();
        char grade = 0;
        if (perc > 90 && perc <= 100) {
            grade = 'S';
        } else if (perc > 80) {
            grade ='A';
        } else if (perc > 70) {
            grade = 'B';
        } else if (perc > 60) {
            grade = 'C';
        } else if (perc > 50) {
            grade = 'D';
        } else if (perc > 40) {
            grade = 'E';
        } else if (perc >= 0 && perc <= 40) {
            grade = 'F';
        } else {
            System.out.println("Illegal input!");
        }
        System.out.println("Your grade: " + grade);
    }
}
