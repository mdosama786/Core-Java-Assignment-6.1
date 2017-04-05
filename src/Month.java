/**@FIRSTLY PROGRAM TO STORE MONTHS AND DAYS IN ARRAY 
 * SECONDLY PROVIDING USER INPUT AS MONTH AND IN RESULT
 * PRINTING NUMBER OF DAYS IN THAT MONTH  
 */

/**@Importing scanner Package*/
import java.util.Scanner;

/** @Creating class month */
public class Month {
	private Scanner object;
	private Scanner object1;

	/** @Creating method cal */
	void cal() {
		String a;
		/** @Enter the name of months in an array A */
		System.out.println("Enter the month");
		object = new Scanner(System.in);
		/** @Store in a */
		a = object.nextLine();
		int date;
		/** @Enter the number of days in a months */
		System.out.println("Enter the day");
		object1 = new Scanner(System.in);
		date = object1.nextInt();
		String[] mon = new String[12];

		/** @Storing months in mon */
		mon[0] = "january";
		mon[1] = "february";
		mon[2] = "march";
		mon[3] = "april";
		mon[4] = "may";
		mon[5] = "june";
		mon[6] = "july";
		mon[7] = "august";
		mon[8] = "september";
		mon[9] = "october";
		mon[10] = "november";
		mon[11] = "december";

		/** @Storing days in array1 */
		int[] array1;
		array1 = new int[12];
		array1[0] = 31;
		array1[1] = 28;
		array1[2] = 31;
		array1[3] = 30;
		array1[4] = 31;
		array1[5] = 30;
		array1[6] = 31;
		array1[7] = 30;
		array1[8] = 31;
		array1[9] = 30;
		array1[10] = 31;
		array1[11] = 30;

		/** @Calculating one on one mapping specified by user by month to day */
		for (int i = 0; i < 11; i++) {
			/** @Using equals function */
			if (a.equals(mon[i])) {
				System.out.println("number of days in  " + mon[i] + " is " + array1[i]);
			}
		}
		int count = 0;
		/** @Calculating total no of days from 1st jan */
		for (int i = 0; i < 11; i++) {

			if (a.equals(mon[i])) {
				for (int j = 0; j < i; j++) {
					count = count + array1[j];
				}
			}
		}
		count = count + date;
		System.out.println("total no of days from 1st jan to month you specified " + count);
	}

	public static void main(String[] args) {
		/** @Creating object to access cal method */
		Month g = new Month();
		g.cal();

	}
}