/*
 * This program in a number guessing game.
 *
 * @author  Ava Venturino
 * @version 1.0
 * @since   2024-02-28
 */

import java.util.Scanner;

/**
 * This is a standard calculation program.
 */
final class NumberGuessingGame {

    /**
     * Number, 6.
     */
    public static final int NUMBER6 = 6;

    /**
     * Preven  instantiation.
     * Throw an exception IllegalStateException.
     * if this is ever called
     *
     * @throws IllegalStateException if this is ever called
     *
     */

    private NumberGuessingGame() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */

    public static void main(final String[] args) {
        // Generate a number between 0 to 6
        final int correctNum = (int) (Math.random() * 7);
        int tries = 0;
        final Scanner scanner = new Scanner(System.in);

        // Use a while loop to continue
        // until the user guesses the right answer
        while (true) {
            System.out.print("Input a number between 0 - 6: ");
            final String userNumString = scanner.nextLine();
            if ("exit".equals(userNumString)) {
                break;
            }
            try {
                final int userNumInt = Integer.parseInt(userNumString);
                if (userNumInt < 0 || userNumInt > NUMBER6) {
                    System.out.println("\nThis is not between 0 and 6\n");
                } else {
                    tries++;
                    if (userNumInt != correctNum) {
                        if (userNumInt < correctNum) {
                            System.out.println("\nYour guess is too low.");
                        } else {
                            System.out.println("\nYour guess is too high.");
                        }
                        System.out.println("Please try again.\n");
                    } else {
                        System.out.println("\nYou guessed correctly! It took you "
                                        + tries + " tries.");
                        break;
                    }
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("\nThat is not a valid input.\n");
            }
        }
	System.out.println("\nDone.");
        scanner.close();
    }
}
