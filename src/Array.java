/**@PROGRAM IN ARRAY 
 * to enter an array and display using for loop 
 */

/**@Importing scanner for user input*/
import java.util.Scanner;

/** @Creating a class array */
public class Array {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/** @Defining an array number */
		int[] number;
		/** @Initializing size */
		number = new int[10];
		System.out.println("ENTER THE NUMBERS");
		/** @for loop to enter array */
		for (int i = 0; i < number.length; i++) {
			/** @for user input */
			Scanner o = new Scanner(System.in);
			System.out.println("enter at " + (+i) + " position");
			number[i] = o.nextInt();

		}
		/** @for loop to print the value entered by the user */
		for (int i = 0; i < number.length; i++) {
			System.out.println(" number entered by you are " + number[i]);
		}
		/** @Logic to calculate even number for an array */
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.println("\n");
				/** @Displaying array */
				System.out.println("even number entered by you " + number[i]);
			}
		}
	}
}