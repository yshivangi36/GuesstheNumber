/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number;

/**
 *
 * @author ay369
 */
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        System.out.println("Welcome to Guess the Number Game!");

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100
            int maxAttempts = 5;
            boolean hasWon = false;

            System.out.println("I have selected a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + maxAttempts + " attempts.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You've guessed the number correctly!");
                    score++;
                    hasWon = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!hasWon) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber);
            }

            System.out.println("Your current score is: " + score);
            System.out.print("Would you like to play again? (yes/no): ");
            String response = scanner.next();

            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Your final score is: " + score);
        scanner.close();
    }
}

