/*
 * This is a program that calculates the amount of energy
 * produced when given the mass.
 *
 * @author  Ava Venturino
 * @version 1.0
 * @since   2024-02-20
 */

import java.util.Scanner;

/**
 * This is a standard calculation program.
 */
final class Index {

    /**
     * Number of food, 1.
     */
    public static final int NUMBEROFFOOD1 = 1;

    /**
     * Number of food, 2.
     */
    public static final int NUMBEROFFOOD2 = 2;

    /**
     * Number of food, 3.
     */
    public static final int NUMBEROFFOOD3 = 3;

    /**
     * Time for food, 1.
     */
    public static final int TIME1 = 1;

    /**
     * Time for food, 0.
     */
    public static final int TIME0 = 0;

    /**
     * Time for food, 2.
     */
    public static final int TIME2 = 2;

    /**
     * Time for food, 3.
     */
    public static final int TIME3 = 3;

    /**
     * Time for food, 8.
     */
    public static final int TIME8 = 8;

    /**
     * Time for food, 18.
     */
    public static final int TIME18 = 18;

    /**
     * Time for food, 20.
     */
    public static final int TIME20 = 20;

    /**
     * Time for food, 30.
     */
    public static final int TIME30 = 30;

    /**
     * Time for food, 45.
     */
    public static final int TIME45 = 45;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */

    private Index() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);

        // Prompt user for the type of food (sub, pizza, or soup)
        System.out.print("Are you heating sub, pizza, or soup?: ");
        final String subPizzaOrSoup = scanner.nextLine();

        // Prompt user for the number of items to cook
        System.out.print("How many " + subPizzaOrSoup
                + "(s) are you cooking? (max: 3): ");
        final int numberOfFood = Integer.parseInt(scanner.nextLine());

        // Process
        int minute = 0;
        int second = 0;

        if ("sub".equals(subPizzaOrSoup)) {
            if (numberOfFood == NUMBEROFFOOD1) {
                minute = TIME1;
                second = TIME0;
            } else if (numberOfFood == NUMBEROFFOOD2) {
                minute = TIME1;
                second = TIME30;
            } else if (numberOfFood == NUMBEROFFOOD3) {
                minute = TIME2;
                second = TIME0;
            } else {
                System.out.println("Invalid input");
            }
        } else if ("pizza".equals(subPizzaOrSoup)) {
            if (numberOfFood == NUMBEROFFOOD1) {
                minute = TIME0;
                second = TIME45;
            } else if (numberOfFood == NUMBEROFFOOD2) {
                minute = TIME1;
                second = TIME8;
            } else if (numberOfFood == NUMBEROFFOOD3) {
                minute = TIME1;
                second = TIME20;
            } else {
                System.out.println("Not a valid answer");
            }
        } else if ("soup".equals(subPizzaOrSoup)) {
            if (numberOfFood == NUMBEROFFOOD1) {
                minute = TIME1;
                second = TIME45;
            } else if (numberOfFood == NUMBEROFFOOD2) {
                minute = TIME2;
                second = TIME18;
            } else if (numberOfFood == NUMBEROFFOOD3) {
                minute = TIME3;
                second = TIME20;
            } else {
                System.out.println("Invalid answer");
            }
        } else {
            System.out.println("Input is invalid, try again");
        }

        // Output

        System.out.println("The total cook time is " + minute
                + " minutes and " + second + " seconds.\n");
        System.out.println("Done.");
    }
}
