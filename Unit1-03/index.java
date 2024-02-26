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
final class MicrowaveCooking {
    
     /**
     * number of food, 1
     */
     public static final double NUMBEROFFOOD1 = 1

     /**   
      * number of food, 2
      */
      public static final double NUMBEROFFOOD2 = 2

     /**   
      * number of food, 3
      */
      public static final double NUMBEROFFOOD3 = 3

     /**   
      * time for food, 1
      */
      public static final double TIME1 = 1

     /**   
      * time for food, 0         
      */              
      public static final double TIME0 = 0

     /**         
      * time for food, 2                       
      */                                  
      public static final double TIME2 = 2

     /**         
      * time for food, 3                  
      */                                  
      public static final double TIME3 = 3

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */

    private MicrowaveCooking() {
        throw new IllegalStateException("Cannot be instantiated");
	}
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for the type of food (sub, pizza, or soup)
        System.out.print("Are you heating sub, pizza, or soup?: ");
        String subPizzaOrSoup = scanner.nextLine();

        // Prompt user for the number of items to cook
        System.out.print("How many " + subPizzaOrSoup
			+ "(s) are you cooking? (max: 3): ");
        int numberOfFood = Integer.parseInt(scanner.nextLine());

        // Process
        int minute = 0;
        int second = 0;

        if (subPizzaOrSoup.equals("sub")) {
		    if (numberOfFood == NUMBEROFFOOD1) {
			    minute = TIME1;
			    second = TIME0;
		    } else if (numberOfFood == NUMBEROFFOOD2) {
			    minute = TIME1;
			    second = 30;
		    } else if (numberOfFood == NUMBEROFFOOD3) {
			    minute = TIME2;
			    second = TIME0;
		    } else {
			    System.out.println("Invalid input");
			    return;
		    }
	    } else if (subPizzaOrSoup.equals("pizza")) {
		    if (numberOfFood == NUMBEROFFOOD1) {
			    minute = TIME0;
			    second = 45;
		    } else if (numberOfFood == NUMBEROFFOOD2) {
			    minute = TIME1;
			    second = 8;
		    } else if (numberOfFood == NUMBEROFFOOD3) {
			    minute = TIME1;
			    second = 20;
		    } else {
			    System.out.println("Invalid input");
			    return;
		    }
	    } else if (subPizzaOrSoup.equals("soup")) {
		    if (numberOfFood == NUMBEROFFOOD1) {
			    minute = TIME1;
			    second = 45;
		    } else if (numberOfFood == NUMBEROFFOOD2) {
			    minute = TIME2;
			    second = 18;
		    } else if (numberOfFood == NUMBEROFFOOD3) {
			    minute = TIME3;
			    second = 20;
		    } else {
			    System.out.println("Invalid input");
			    return;
		    }
	    } else {
		    System.out.println("Invalid Input");
		    return;
	    }

	    // Output

	    System.out.println("The total cook time is " + minute 
			    + " minutes and " + second + " seconds.\n");
	    System.out.println("Done.");
    }
}
