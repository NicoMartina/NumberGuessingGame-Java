import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        Player player = new Player(username);

        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = 0;
            int topTries = 0;
            int guess;
            int tries = 0;

            System.out.println("Hey there! Welcome to the number guessing game!");
            System.out.println("1. Easy: 1 to 10, 5 tries");
            System.out.println("2. Medium: 1 to 50, 4 tries");
            System.out.println("3. Hard: 1 to 100, 3 tries");

            int level = scanner.nextInt();

            switch (level) {
                case 1:
                    targetNumber = random.nextInt(10) + 1;
                    topTries = 5;
                    break;
                case 2:
                    targetNumber = random.nextInt(50) + 1;
                    topTries = 4;
                    break;
                case 3:
                    targetNumber = random.nextInt(100) + 1;
                    topTries = 3;
                    break;
                default:
                    System.out.println("Invalid choice, using Easy level.");
                    targetNumber = random.nextInt(10) + 1;
                    topTries = 5;
            }

            System.out.println("Awesome! Let's get started. Choose a number:");

            long startTime = System.currentTimeMillis();

            while (tries < topTries) {
                guess = scanner.nextInt();

                if (guess == targetNumber) {
                    System.out.println("Congrats, you've guessed!");
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
                tries++;
            }

            if (tries == topTries) {
                System.out.println("You're all out of tries! The number was: " + targetNumber);
            }

            long endTime = System.currentTimeMillis();
            long timeTaken = (endTime - startTime) / 1000;

            System.out.println("⏱ You took " + timeTaken + " seconds to finish the game.");
            player.setHighScore(timeTaken);
            System.out.println("🎉 Your best time is: " + player.getHighScore() + " seconds.");

            scanner.nextLine(); // clear buffer
            System.out.println("Play again? (yes/no)");
            String again = scanner.nextLine();
            if (!again.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing, " + username + "!");
            }
        }

        scanner.close();
    }
}
