
/**@PROGRAM TO PRINT PRIME NUMBER STORED IN ARRAY IN REVERSE ORDER
 * USING two different array
 */

/**@Importing scanner package*/
import java.util.Scanner;

/** @Creating a class ArrayDecending */

public class ArrayDecending {

	public static void main(String[] args) {
		/** @Defining two array */
		int[] array1, array2;
		/** @Initializing array */
		array1 = new int[6];
		array2 = new int[array1.length];
		/** @Entering prime number in first array */
		System.out.println("enter prime number");
		for (int i = 0; i < array1.length; i++) {
			/** @User input through scanner */
			@SuppressWarnings("resource")
			Scanner o = new Scanner(System.in);
			array1[i] = o.nextInt();
		}
		/** @Printing array stored in array1 */
		System.out.println(" Number entered by you in array1  ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(+array1[i] + ", ");
		}
		/** @Logic to print stored array in Decending order */
		System.out.println("ARRAY2 IN DECENDING ORDER");
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];

		}
		for (int i = array2.length - 1; i >= 0; i--) {
			System.out.print(array2[i] + " , ");
		}
	}
}
