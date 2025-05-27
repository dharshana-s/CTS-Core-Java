import java.util.Scanner;
import java.util.Random;

public class randomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int targetNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 5; 

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. You have " + attempts + " chances to guess it.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Too low!");
            } else if (guess > targetNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("🎉 Congratulations! You guessed the correct number: " + targetNumber);
                scanner.close(); 
                return; 
            }
        }

        System.out.println("Game Over! You've used all " + attempts + " attempts. The correct number was: " + targetNumber);
        scanner.close(); 
    }
}