// Import
import java.util.*;

// Class
public class index {
    public static void main(String[] args) {

        // Setup
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        // Variables
        int max = 100;
        int number = rand.nextInt(max);
        int tries = 3;
        
        // Intro/Rules
        System.out.println("GUESS THE NUMBER");
        System.out.println();
        System.out.println("This is a text based game where you guess a random number from 1-100.");
        System.out.println();

        // Game
        while (tries > 0) {
            // Guessing
            System.out.println("Guess The Number: ");
            String input = scan.nextLine();
            int guess = Integer.parseInt(input);

            // Input handling
            if (guess < 0 || guess > 100) {
                System.out.println("You can't even follow simple rules?");
                System.exit(1);
            }
            
            // Logic
            if (guess == number) {
                System.out.println("You have guessed correctly!");
                System.exit(1);
            } else {
                System.out.println("You have guessed wrong!");
                tries -= 1;

                // Hints
                if (guess > number) {
                    System.out.println("Your guess was greater than the answer.");
                } else if (guess < number) {
                    System.out.println("Your guess was less than the answer.");
                }
            }
        }
        // Answer
        System.out.println("Game Over! The number was: " + number);
    }
}