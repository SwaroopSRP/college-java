public class VowelConsonant {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        java.util.Scanner s1 = new java.util.Scanner(System.in);
        char ch = s1.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Consonant");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
