
public class Activity2_2 {

	public static void main(String[] args) {
		
		//initializing variables
		String line = "the quick brown fox";
		String reversedString = "";
		
		//use for loop to reverse the char
		for (int i = line.length() - 1; i >= 0; i--) {
			char tempoString = line.charAt(i); //place the reversed string to a temporary char

			//compare temporary. if temporary is not equal to space
			if (tempoString != ' ') {
				reversedString += tempoString; //temporary char will be moved to the reversedString variable

			}
		}
		System.out.println(reversedString.toUpperCase()); //output will be the reversed string in upper case

	}

}
