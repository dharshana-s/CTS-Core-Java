import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println(isPalindrome(input) ? "Palindrome!" : "Not a palindrome.");
        scanner.close();
    }
}