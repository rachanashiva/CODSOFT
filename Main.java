package numbergame;
import java.util.Random;   // Import for random number generation
import java.util.Scanner;  // Import for user input

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to read user input
        Random random = new Random();            // Random number generator
        int lowerBound = 1;                      // Minimum number in the range
        int upperBound = 100;                    // Maximum number in the range
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound; 
        int userGuess = 0;                       // Variable to store user's guess
        int attempts = 0;                        // Counter for number of attempts
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound);

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt(); 
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
