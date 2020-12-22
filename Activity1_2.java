import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Activity1_2 {

	public static void main(String[] args) {

//arraylist 
		List<Integer> numbers = new ArrayList<>(Arrays.asList(15, 30, 25, 19, 30, 40));

		System.out.println(numbers);

//to read user input
		Scanner input = new Scanner(System.in);
		int toDelete;

		
//while the arraylist is NOT empty
//it will loop through the arraylist, 
//compare the arraylist to the user input

		while (!numbers.isEmpty()) {
			System.out.print("choose an element to delete: ");
			toDelete = input.nextInt();

			boolean isFound = false;
			
			
			for (int i = 0; i < numbers.size(); i++) {
				if (numbers.get(i) == toDelete) {
					numbers.remove(i);

					isFound = true;
				}

			}
		
// if it successfully removed the element.
// it will print the updated arraylist
			if (isFound) {
				System.out.print("New list: ");
				System.out.println(numbers);
			}
			else {
				System.out.println("NOT FOUND: error");
			}
			if(numbers.isEmpty()) {
				System.out.println("List is now empty!");
			}
		}
	}
}