public class BMICalc {
    public static void main(String[] args) {
        System.out.print("Enter your weight in kg: ");
        java.util.Scanner s1 = new java.util.Scanner(System.in);
        double weight = s1.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = s1.nextDouble();
        double bmi = weight / (height * height);
        System.out.print("BMI: " + bmi + " ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
