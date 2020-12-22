import java.util.Scanner;

public class Activity1_1 {

	public static void main(String[] args) {
		/*
		 * Instantiating two dimensional array of row length 100 to iterate upto 100
		 * times to accommodate all the invalid inputs from user along with removing
		 * operation, column length 6 as we have only 6 elements defined
		 * (15,30,25,19,30,40)
		 */
		int[][] tempArray = new int[100][6];
		/*
		 * Initializing a variable arrrayVal to iterate over the row numbers for each
		 * loop
		 */
		int arrrayVal = 0;
		// Initializing all the values of the array on the first row of the tempArray
		// array/
		tempArray[0][0] = 15;
		tempArray[0][1] = 30;
		tempArray[0][2] = 25;
		tempArray[0][3] = 19;
		tempArray[0][4] = 30;
		tempArray[0][5] = 40;

		/*
		 * Initializing a varibale arraySize with initial array length (temp[0][x]).i.e.
		 * 6, to track the number of array elements after removal of user defined
		 * element
		 */
		int arraySize = tempArray[0].length;
		Scanner arrayObj = new Scanner(System.in);
		// FOR loop to iterate 100 times to execute user inputs/
		for (int i = 0; i < 100; i++) {
			// Initializing a variable counter to count the number of occurances of element
			// obtained from user input/
			int counter = 0;
			// Getting the element to delete from the user/
			System.out.print("Enter an element to delete: ");
			int number = arrayObj.nextInt();
			// This FOR loop iterates through each element of the array and count the
			// occurances of an element/
			for (int arr = 0; arr < tempArray[0].length; arr++) {
				if (tempArray[0][arr] == number) {
					counter = counter + 1;
				}
			}
			// If the counter is 0, the element given by user is valid, so we continue and
			// exit the current loop/
			if (counter == 0) {
				System.out.println("Error! No element found");
				continue;
			}
			/*
			 * During each loop we track the array size by removing the count of occurances
			 * of user defined element from arraySize variable
			 */
			arraySize = arraySize - counter;
			// If the arraySize is 0, the array is empty, so we break and exit the FOR loop
			// completely/
			if (arraySize == 0) {
				System.out.print("Array is Empty");
				break;
			}
			/*
			 * Initializing a FOR to compare each element from current tempArray row with
			 * the user defined value and storing them in the next tempArray row when there
			 * is no match, while excluding if it matches .i.e., removal. Size of the next
			 * row is tracked by a variable 'a' here. This defines the column size of the
			 * next row
			 */
			for (int arr = 0, a = 0; arr < tempArray[0].length; arr++) {
				if (number != tempArray[arrrayVal][arr]) {
					// Copying the value to the next tempArray row/
					tempArray[arrrayVal + 1][a] = tempArray[arrrayVal][arr];
					/*
					 * Variable 'a' will increment only when we want to copy the value to the next
					 * row. Purpose of this variable is to eliminate the introduction of 0 in the
					 * place of element which needs to be removed. Hence we need a variable to
					 * increment only when we want to copy the the values except the ones to be
					 * removed
					 */
					a = a + 1;
				}
			}
			// Printing the new list with the updated elements/
			System.out.print("New list: ");
			for (i = 0; i < arraySize; i++) {
				/*
				 * We use tempArray with arrrayVal+1 row so that we can print the next row where
				 * we copied the values. This row value will incremented during each loop to use
				 * new rows to store the updated values on each loop
				 */
				System.out.print(tempArray[arrrayVal + 1][i] + " ");
			}
			System.out.println("");
			/*
			 * Incrementing the arrrayVal variable to move through the rows of tempArray.
			 * This value will increment by 1 during each loop
			 */
			arrrayVal = arrrayVal + 1;
		}
	}

}
