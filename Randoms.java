import java.util.*;

public class Randoms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean playAgain = true;
        int score = 0;

        System.out.println("Welcome to the number guessing game:");

        while (playAgain) {
            int l = 1;
            int u = 100;
            int generatedNum = r.nextInt(u - l + 1) + l;
            int attempts = 0;
            boolean guess = false;

            System.out.println("\nA number has been generated between " + l + " and " + u + "...");

            while (!guess && attempts < 7) {
                System.out.println("Enter your guess (attempt " + (attempts + 1) + "):");
                int userGuess = sc.nextInt();

                if (userGuess < generatedNum) {
                    System.out.println("Too low! Try again with a higher number.");
                } else if (userGuess > generatedNum) {
                    System.out.println("Too high! Try again with a lower number.");
                } else {
                    System.out.println("Congrats! You guessed correctly.");
                    guess = true;
                }
                attempts++;
            }

            if (!guess) {
                System.out.println("\nSorry, you used all your attempts! The number was: " + generatedNum);
            }

            score += 7 - attempts;
            System.out.println("\nYour current score is: " + score);
            System.out.println("Do you want to play again? (yes/no):");
            sc.nextLine();
            String playChoice = sc.nextLine().trim().toLowerCase();
            if (!playChoice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nTHANK YOU FOR PLAYING.");
        sc.close();
    }
}
