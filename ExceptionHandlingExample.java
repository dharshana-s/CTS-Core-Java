import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int num = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int den = scanner.nextInt();

        try {
            System.out.println("Result: " + num / den);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        
        scanner.close();
    }
}