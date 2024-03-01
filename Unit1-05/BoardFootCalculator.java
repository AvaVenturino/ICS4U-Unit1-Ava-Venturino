/*
 * This program calculates the length to create boardfood wood.
 *
 * @author  Ava Venturino
 * @version 1.0
 * @since   2024-02-28
 */

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * This is a standard calculation program.
 */

final class BoardFootCalculator {

    /**
     * Number, 6.
     */
    public static final int NUMBER144 = 144;

    /**
     * Preven  instantiation.
     * Throw an exception IllegalStateException.
     * if this is ever called
     *
     * @throws IllegalStateException if this is ever called
     *
     */

    private BoardFootCalculator() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting calculateBoardFoot() function.
     *
     * @param width using width
     *
     * @param height using height
     */

    public static double calculateBoardFoot(double width, double height) {
        final double volume = NUMBER144;
        final double length = volume / (width * height);
        return length;
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        try {
            // Input
            System.out.print("Enter the width of the piece of wood (in inches): ");
            final double width = scanner.nextDouble();
            System.out.print("Enter the height of the piece of wood (in inches): ");
            final double height = scanner.nextDouble();

            // Error checking

            if (width <= 0 || height <= 0) {

                System.out.println("\nInvalid input.");
                return;
            }
	


            // Calculate length using the calculateBoardFoot method

            final double length = calculateBoardFoot(width, height);

            // Output

            System.out.printf("\nThe length should be %.1f inches.", length);
            System.out.println("\nDone.");

	} catch (InputMismatchException e) {
            System.out.println("Invalid input.");
	} finally {
                scanner.close();
	}
    }
}
