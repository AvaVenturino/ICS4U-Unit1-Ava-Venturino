import java.util.Scanner;

public class BoardFootCalculator {

    public static double calculateBoardFoot(double width, double height) {
        final double volume = 144; // 1 board foot is 144 cubic inches
        double length = volume / (width * height); // Calculate length to achieve 1 board foot
        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the width of the piece of wood (in inches): ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the piece of wood (in inches): ");
	double height = scanner.nextDouble();

        // Error checking

	if (width <= 0 || height <= 0) {
				
            System.out.println("\nInvalid input. Width and height must be positive numbers.\n");
            return;
        }
						       //
						       //                                                                                                                                 // Calculate length using the calculateBoardFoot method
						       //                                                                                                                                         double length = calculateBoardFoot(width, height);
						       //
						       //                                                                                                                                                 // Output
						       //                                                                                                                                                         System.out.printf("To make exactly 1 board foot of wood, the length should be %.1f inches.%n", length);
						       //                                                                                                                                                                 System.out.println("\nDone.");
						       //
						       //                                                                                                                                                                         scanner.close();
						       //                                                                                                                                                                             }
						       //                                                                                                                                                                             }
						       //
